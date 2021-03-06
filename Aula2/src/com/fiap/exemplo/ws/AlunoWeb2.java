package com.fiap.exemplo.ws;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

@WebService
public class AlunoWeb2 {
	
	@Resource
	private WebServiceContext wsctx;
	
	private List<Aluno> alunos;
	
	public AlunoWeb2(){
		this.alunos = new ArrayList<>();
	}
	
	@WebMethod
	public String novo(@WebParam(name="aluno",   header=false) Aluno aluno, 
					   @WebParam(name="usuario", header=true) String usuario, 
					   @WebParam(name="senha",   header=true) String senha){
		if(autenticado(usuario, senha)){
			alunos.add(aluno);
			return "Sucesso!";
		} else {
			return "Acesso negado ! ";
		}
	}
	
	@WebMethod
	public List<Aluno> listar(@WebParam(name="usuario", header=true) String usuario, 
			   				  @WebParam(name="senha",   header=true) String senha) throws AccessDeniedException{
		if(autenticado(usuario, senha)){
			return alunos;
		} else {
			throw new AccessDeniedException("Usu�rio n�o localizao!");
		}
	}
	
	@WebMethod(exclude=true)
	public boolean autenticado(String usuario, String senha){
		return "igao".equals(usuario) && "1234".equals(senha);
	}

}
