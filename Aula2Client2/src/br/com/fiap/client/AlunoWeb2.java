
package br.com.fiap.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AlunoWeb2", targetNamespace = "http://ws.exemplo.fiap.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AlunoWeb2 {


    /**
     * 
     * @param senha
     * @param usuario
     * @param parameters
     * @return
     *     returns br.com.fiap.client.ListarResponse
     * @throws AccessDeniedException_Exception
     */
    @WebMethod
    @WebResult(name = "listarResponse", targetNamespace = "http://ws.exemplo.fiap.com/", partName = "result")
    @Action(input = "http://ws.exemplo.fiap.com/AlunoWeb2/listarRequest", output = "http://ws.exemplo.fiap.com/AlunoWeb2/listarResponse", fault = {
        @FaultAction(className = AccessDeniedException_Exception.class, value = "http://ws.exemplo.fiap.com/AlunoWeb2/listar/Fault/AccessDeniedException")
    })
    public ListarResponse listar(
        @WebParam(name = "listar", targetNamespace = "http://ws.exemplo.fiap.com/", partName = "parameters")
        Listar parameters,
        @WebParam(name = "usuario", targetNamespace = "http://ws.exemplo.fiap.com/", header = true, partName = "usuario")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "http://ws.exemplo.fiap.com/", header = true, partName = "senha")
        String senha)
        throws AccessDeniedException_Exception
    ;

    /**
     * 
     * @param senha
     * @param usuario
     * @param parameters
     * @return
     *     returns br.com.fiap.client.NovoResponse
     */
    @WebMethod
    @WebResult(name = "novoResponse", targetNamespace = "http://ws.exemplo.fiap.com/", partName = "result")
    @Action(input = "http://ws.exemplo.fiap.com/AlunoWeb2/novoRequest", output = "http://ws.exemplo.fiap.com/AlunoWeb2/novoResponse")
    public NovoResponse novo(
        @WebParam(name = "novo", targetNamespace = "http://ws.exemplo.fiap.com/", partName = "parameters")
        Novo parameters,
        @WebParam(name = "usuario", targetNamespace = "http://ws.exemplo.fiap.com/", header = true, partName = "usuario")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "http://ws.exemplo.fiap.com/", header = true, partName = "senha")
        String senha);

}
