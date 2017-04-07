package br.com.fiap.teste;

import br.com.fiap.client.Aluno;
import br.com.fiap.client.AlunoWeb2;
import br.com.fiap.client.AlunoWeb2Service;
import br.com.fiap.client.Novo;

public class TesteNovo {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Ale");
		aluno.setAprovado("SEM DUVIDA");
		aluno.setRm(66666L);
		
		AlunoWeb2 port = new AlunoWeb2Service().getAlunoWeb2Port();
		Novo parametros = new Novo();
		parametros.setAluno(aluno);
		
		System.out.println(port.novo(parametros, "igao", "1234").getReturn());
	}

}
