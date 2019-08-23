
package com.learnwebservices.services.tempconverter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fahrenheitToCelsiusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fahrenheitToCelsiusRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TemperatureInFahrenheit" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fahrenheitToCelsiusRequest", namespace = "http://learnwebservices.com/services/tempconverter", propOrder = {
    "temperatureInFahrenheit"
})
public class FahrenheitToCelsiusRequest {

    @XmlElement(name = "TemperatureInFahrenheit", namespace = "http://learnwebservices.com/services/tempconverter")
    protected double temperatureInFahrenheit;

    /**
     * Gets the value of the temperatureInFahrenheit property.
     * 
     */
    public double getTemperatureInFahrenheit() {
        return temperatureInFahrenheit;
    }

    /**
     * Sets the value of the temperatureInFahrenheit property.
     * 
     */
    public void setTemperatureInFahrenheit(double value) {
        this.temperatureInFahrenheit = value;
    }

}
