
package helloWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SayHello complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SayHello">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HelloRequest" type="{http://learnwebservices.com/services/hello}helloRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SayHello", propOrder = {
    "helloRequest"
})
public class SayHello {

    @XmlElement(name = "HelloRequest", required = true)
    protected HelloRequest helloRequest;

    /**
     * Gets the value of the helloRequest property.
     * 
     * @return
     *     possible object is
     *     {@link HelloRequest }
     *     
     */
    public HelloRequest getHelloRequest() {
        return helloRequest;
    }

    /**
     * Sets the value of the helloRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link HelloRequest }
     *     
     */
    public void setHelloRequest(HelloRequest value) {
        this.helloRequest = value;
    }

}
