package br.com.fiap.teste;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import br.com.fiap.client.AccessDeniedException_Exception;
import br.com.fiap.client.Aluno;
import br.com.fiap.client.AlunoWeb;
import br.com.fiap.client.AlunoWebService;

public class TesteChamada {
	
	public static void main(String[] args) throws AccessDeniedException_Exception {
		Aluno aluno = new Aluno();
		aluno.setAprovado("COM CERTEZA");
		aluno.setRm(89999L);
		aluno.setNome("Jared Leto");
		
		AlunoWeb port = new AlunoWebService().getAlunoWebPort();
		Map<String, Object> req_ctx = ((BindingProvider)port).getRequestContext();
		
		Map<String,List<String>> headers = new HashMap<>();
		
		headers.put("Username", Collections.singletonList("igao"));
		headers.put("Password", Collections.singletonList("1234"));
		
		req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		
		System.out.println(port.novo(aluno));
		
		for (Aluno a : port.listar()) {
			System.out.println("Nome: " + a.getNome());
		}
	}
}

