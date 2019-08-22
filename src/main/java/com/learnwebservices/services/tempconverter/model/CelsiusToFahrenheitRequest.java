package com.learnwebservices.services.tempconverter.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CelsiusToFahrenheitRequest", propOrder = {
        "temperatureInCelsius"
})
public class CelsiusToFahrenheitRequest {

    @XmlElement(name = "TemperatureInCelsius", required = true)
    private int temperatureInCelsius;

    public int getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(int temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }
}
