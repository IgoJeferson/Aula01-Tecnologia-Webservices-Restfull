
package br.com.fiap.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Arquivo", targetNamespace = "http://exemplos.ws.fiap.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Arquivo {


    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "upload", targetNamespace = "http://exemplos.ws.fiap.com/", className = "br.com.fiap.client.Upload")
    @ResponseWrapper(localName = "uploadResponse", targetNamespace = "http://exemplos.ws.fiap.com/", className = "br.com.fiap.client.UploadResponse")
    @Action(input = "http://exemplos.ws.fiap.com/Arquivo/uploadRequest", output = "http://exemplos.ws.fiap.com/Arquivo/uploadResponse")
    public void upload(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        byte[] arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "download", targetNamespace = "http://exemplos.ws.fiap.com/", className = "br.com.fiap.client.Download")
    @ResponseWrapper(localName = "downloadResponse", targetNamespace = "http://exemplos.ws.fiap.com/", className = "br.com.fiap.client.DownloadResponse")
    @Action(input = "http://exemplos.ws.fiap.com/Arquivo/downloadRequest", output = "http://exemplos.ws.fiap.com/Arquivo/downloadResponse")
    public byte[] download(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
