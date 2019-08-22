package com.learnwebservices.services.tempconverter;

import com.learnwebservices.services.tempconverter.model.CelsiusToFahrenheitRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CelsiusToFahrenheit", propOrder = {"celsiusToFahrenheitRequest"})
public class CelsiusToFahrenheit {

    @XmlElement(name = "CelsiusToFahrenheitRequest", required = true)
    private CelsiusToFahrenheitRequest celsiusToFahrenheitRequest;

    public CelsiusToFahrenheitRequest getCelsiusToFahrenheitRequest() {
        return celsiusToFahrenheitRequest;
    }

    public void setCelsiusToFahrenheitRequest(CelsiusToFahrenheitRequest celsiusToFahrenheitRequest) {
        this.celsiusToFahrenheitRequest = celsiusToFahrenheitRequest;
    }
}
