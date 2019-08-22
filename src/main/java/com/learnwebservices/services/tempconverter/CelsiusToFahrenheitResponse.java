package com.learnwebservices.services.tempconverter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CelsiusToFahrenheitResponse", propOrder = {"celsiusToFahrenheitResponse"}, namespace = "http://learnwebservices.com/services/tempconverter")
public class CelsiusToFahrenheitResponse {
    private com.learnwebservices.services.tempconverter.model.CelsiusToFahrenheitResponse celsiusToFahrenheitResponse;

    public com.learnwebservices.services.tempconverter.model.CelsiusToFahrenheitResponse getCelsiusToFahrenheitResponse() {
        return celsiusToFahrenheitResponse;
    }

    public void setCelsiusToFahrenheitResponse(com.learnwebservices.services.tempconverter.model.CelsiusToFahrenheitResponse celsiusToFahrenheitResponse) {
        this.celsiusToFahrenheitResponse = celsiusToFahrenheitResponse;
    }
}
