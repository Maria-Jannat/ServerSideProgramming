/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesurazure;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

/**
 *
 * @author HP
 */
public class AirportConverter_5_21 implements Converter {

    public Object getAsObject(FacesContext ctxt, UIComponent comp,
            String value) {
        Airport_5_20 airport = null;
        if ("BOS".equalsIgnoreCase(value)) {
            airport = new Airport_5_20("BOS", "Logan International Airport");
        }
        if ("ORD".equalsIgnoreCase(value)) {
            airport = new Airport_5_20("ORD", "O'Hare International Airport");
        }
        if (airport == null) {
            FacesMessage message
                    = new FacesMessage(
                            FacesMessage.SEVERITY_ERROR,
                            "UnrecognizedAirportCode",
                            "Airport code " + value + " is not recognized");
            throw new ConverterException(message);
        }
        return airport;
    }

    public String getAsString(FacesContext ctxt, UIComponent comp,
            Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        return "";
    }
}
