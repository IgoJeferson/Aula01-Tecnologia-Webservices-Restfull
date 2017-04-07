
package br.com.fiap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.fiap.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NovoResponse_QNAME = new QName("http://ws.exemplo.fiap.com/", "novoResponse");
    private final static QName _ListarResponse_QNAME = new QName("http://ws.exemplo.fiap.com/", "listarResponse");
    private final static QName _Novo_QNAME = new QName("http://ws.exemplo.fiap.com/", "novo");
    private final static QName _Listar_QNAME = new QName("http://ws.exemplo.fiap.com/", "listar");
    private final static QName _Ola_QNAME = new QName("http://ws.exemplo.fiap.com/", "ola");
    private final static QName _AccessDeniedException_QNAME = new QName("http://ws.exemplo.fiap.com/", "AccessDeniedException");
    private final static QName _OlaResponse_QNAME = new QName("http://ws.exemplo.fiap.com/", "olaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.fiap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OlaResponse }
     * 
     */
    public OlaResponse createOlaResponse() {
        return new OlaResponse();
    }

    /**
     * Create an instance of {@link AccessDeniedException }
     * 
     */
    public AccessDeniedException createAccessDeniedException() {
        return new AccessDeniedException();
    }

    /**
     * Create an instance of {@link Ola }
     * 
     */
    public Ola createOla() {
        return new Ola();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link Novo }
     * 
     */
    public Novo createNovo() {
        return new Novo();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link NovoResponse }
     * 
     */
    public NovoResponse createNovoResponse() {
        return new NovoResponse();
    }

    /**
     * Create an instance of {@link Aluno }
     * 
     */
    public Aluno createAluno() {
        return new Aluno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NovoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplo.fiap.com/", name = "novoResponse")
    public JAXBElement<NovoResponse> createNovoResponse(NovoResponse value) {
        return new JAXBElement<NovoResponse>(_NovoResponse_QNAME, NovoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplo.fiap.com/", name = "listarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Novo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplo.fiap.com/", name = "novo")
    public JAXBElement<Novo> createNovo(Novo value) {
        return new JAXBElement<Novo>(_Novo_QNAME, Novo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplo.fiap.com/", name = "listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ola }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplo.fiap.com/", name = "ola")
    public JAXBElement<Ola> createOla(Ola value) {
        return new JAXBElement<Ola>(_Ola_QNAME, Ola.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessDeniedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplo.fiap.com/", name = "AccessDeniedException")
    public JAXBElement<AccessDeniedException> createAccessDeniedException(AccessDeniedException value) {
        return new JAXBElement<AccessDeniedException>(_AccessDeniedException_QNAME, AccessDeniedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OlaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplo.fiap.com/", name = "olaResponse")
    public JAXBElement<OlaResponse> createOlaResponse(OlaResponse value) {
        return new JAXBElement<OlaResponse>(_OlaResponse_QNAME, OlaResponse.class, null, value);
    }

}
