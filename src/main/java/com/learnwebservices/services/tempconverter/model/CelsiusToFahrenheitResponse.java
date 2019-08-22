package com.learnwebservices.services.tempconverter.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CelsiusToFahrenheitResponse", propOrder = {"temperatureInFahrenheit"})
public class CelsiusToFahrenheitResponse {

    @XmlElement(name = "TemperatureInFahrenheit", required = true)
    private int temperatureInFahrenheit;

    public int getTemperatureInFahrenheit() {
        return temperatureInFahrenheit;
    }

    public void setTemperatureInFahrenheit(int temperatureInFahrenheit) {
        this.temperatureInFahrenheit = temperatureInFahrenheit;
    }
}
