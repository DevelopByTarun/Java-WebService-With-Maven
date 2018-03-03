
package com.bc.server.code.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bc.server.code.ws package. 
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

    private final static QName _Divide_QNAME = new QName("http://ws.code.server.bc.com/", "divide");
    private final static QName _Cube_QNAME = new QName("http://ws.code.server.bc.com/", "cube");
    private final static QName _DivideResponse_QNAME = new QName("http://ws.code.server.bc.com/", "divideResponse");
    private final static QName _SquareResponse_QNAME = new QName("http://ws.code.server.bc.com/", "squareResponse");
    private final static QName _Multiply_QNAME = new QName("http://ws.code.server.bc.com/", "multiply");
    private final static QName _Add_QNAME = new QName("http://ws.code.server.bc.com/", "add");
    private final static QName _CubeResponse_QNAME = new QName("http://ws.code.server.bc.com/", "cubeResponse");
    private final static QName _Square_QNAME = new QName("http://ws.code.server.bc.com/", "square");
    private final static QName _AddResponse_QNAME = new QName("http://ws.code.server.bc.com/", "addResponse");
    private final static QName _MultiplyResponse_QNAME = new QName("http://ws.code.server.bc.com/", "multiplyResponse");
    private final static QName _Subtract_QNAME = new QName("http://ws.code.server.bc.com/", "subtract");
    private final static QName _SubtractResponse_QNAME = new QName("http://ws.code.server.bc.com/", "subtractResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bc.server.code.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link CubeResponse }
     * 
     */
    public CubeResponse createCubeResponse() {
        return new CubeResponse();
    }

    /**
     * Create an instance of {@link Square }
     * 
     */
    public Square createSquare() {
        return new Square();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link MultiplyResponse }
     * 
     */
    public MultiplyResponse createMultiplyResponse() {
        return new MultiplyResponse();
    }

    /**
     * Create an instance of {@link Subtract }
     * 
     */
    public Subtract createSubtract() {
        return new Subtract();
    }

    /**
     * Create an instance of {@link SubtractResponse }
     * 
     */
    public SubtractResponse createSubtractResponse() {
        return new SubtractResponse();
    }

    /**
     * Create an instance of {@link Divide }
     * 
     */
    public Divide createDivide() {
        return new Divide();
    }

    /**
     * Create an instance of {@link Cube }
     * 
     */
    public Cube createCube() {
        return new Cube();
    }

    /**
     * Create an instance of {@link DivideResponse }
     * 
     */
    public DivideResponse createDivideResponse() {
        return new DivideResponse();
    }

    /**
     * Create an instance of {@link SquareResponse }
     * 
     */
    public SquareResponse createSquareResponse() {
        return new SquareResponse();
    }

    /**
     * Create an instance of {@link Multiply }
     * 
     */
    public Multiply createMultiply() {
        return new Multiply();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.code.server.bc.com/", name = "divide")
    public JAXBElement<Divide> createDivide(Divide value) {
        return new JAXBElement<Divide>(_Divide_QNAME, Divide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cube }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.code.server.bc.com/", name = "cube")
    public JAXBElement<Cube> createCube(Cube value) {
        return new JAXBElement<Cube>(_Cube_QNAME, Cube.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.code.server.bc.com/", name = "divideResponse")
    public JAXBElement<DivideResponse> createDivideResponse(DivideResponse value) {
        return new JAXBElement<DivideResponse>(_DivideResponse_QNAME, DivideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SquareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.code.server.bc.com/", name = "squareResponse")
    public JAXBElement<SquareResponse> createSquareResponse(SquareResponse value) {
        return new JAXBElement<SquareResponse>(_SquareResponse_QNAME, SquareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.code.server.bc.com/", name = "multiply")
    public JAXBElement<Multiply> createMultiply(Multiply value) {
        return new JAXBElement<Multiply>(_Multiply_QNAME, Multiply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.code.server.bc.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CubeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.code.server.bc.com/", name = "cubeResponse")
    public JAXBElement<CubeResponse> createCubeResponse(CubeResponse value) {
        return new JAXBElement<CubeResponse>(_CubeResponse_QNAME, CubeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Square }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.code.server.bc.com/", name = "square")
    public JAXBElement<Square> createSquare(Square value) {
        return new JAXBElement<Square>(_Square_QNAME, Square.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.code.server.bc.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.code.server.bc.com/", name = "multiplyResponse")
    public JAXBElement<MultiplyResponse> createMultiplyResponse(MultiplyResponse value) {
        return new JAXBElement<MultiplyResponse>(_MultiplyResponse_QNAME, MultiplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.code.server.bc.com/", name = "subtract")
    public JAXBElement<Subtract> createSubtract(Subtract value) {
        return new JAXBElement<Subtract>(_Subtract_QNAME, Subtract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.code.server.bc.com/", name = "subtractResponse")
    public JAXBElement<SubtractResponse> createSubtractResponse(SubtractResponse value) {
        return new JAXBElement<SubtractResponse>(_SubtractResponse_QNAME, SubtractResponse.class, null, value);
    }

}
