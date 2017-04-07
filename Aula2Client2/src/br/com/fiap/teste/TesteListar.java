package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.client.AccessDeniedException_Exception;
import br.com.fiap.client.Aluno;
import br.com.fiap.client.AlunoWeb2;
import br.com.fiap.client.AlunoWeb2Service;
import br.com.fiap.client.Listar;
import br.com.fiap.client.ListarResponse;
import br.com.fiap.client.Novo;

public class TesteListar {
	
	public static void main(String[] args) {
		
		AlunoWeb2 port = new AlunoWeb2Service().getAlunoWeb2Port();
		Listar requisicao = new Listar();
		
		ListarResponse response;
		try {
			response = port.listar(requisicao,  "igao", "1234");
			List<Aluno> alunos = response.getReturn();
			
			for (Aluno aluno : alunos) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Status: " + aluno.getAprovado());
				System.out.println("RM: " + aluno.getRm());
				System.out.println("=============================");
				
			}
			
		} catch (AccessDeniedException_Exception e) {
			e.printStackTrace();
		}
		
	}

}
