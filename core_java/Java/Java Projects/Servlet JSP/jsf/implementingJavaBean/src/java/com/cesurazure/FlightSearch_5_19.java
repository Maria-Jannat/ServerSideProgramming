package com.cesurazure;

import java.util.ArrayList;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

public class FlightSearch_5_19 {

    String origination;
    String destination;
    String departDate;
    String departTime;
    String returnDate;
    String returnTime;
    String tripType;
    ArrayList matchingFlights = new ArrayList();
    String flightNum;
    Flight_5_10 matchingFlight;

    public FlightSearch_5_19() {
        setTripType("RoundTrip");
    }

    public String getOrigination() {
        return origination;
    }

    public void setOrigination(String origination) {
        this.origination = origination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartDate() {
        return departDate;
    }

    public void setDepartDate(String departDate) {
        this.departDate = departDate;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public void setMatchingFlights(ArrayList matchingFlights) {
        this.matchingFlights = matchingFlights;
    }

    public String reset() {
        this.setDepartDate("");
        this.setDepartTime("");
        this.setDestination("");
        this.setOrigination("");
        this.setReturnDate("");
        this.setReturnTime("");
        this.setTripType("");
        return "success";
    }

    public String search() {
        if (origination.equals("BOS") && destination.equals("ORD")) {
            return "success";
        } else {
            return "no flights";
        }
    }

    public Flight_5_10 getMatchingFlight() {
        for (int i = 0; i < matchingFlights.size(); i++) {
            matchingFlight = (Flight_5_10) matchingFlights.get(i);
            if (matchingFlight.flightNum.equals(flightNum)) {
                break;
            }
            matchingFlight = null;
        }
        return matchingFlight;
    }

    public void setMatchingFlight(Flight_5_10 flight) {
        matchingFlight = flight;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String string) {
        flightNum = string;
    }

    public String select() {
        FacesContext context = FacesContext.getCurrentInstance();
        Map requestParams
                = context.getExternalContext().getRequestParameterMap();
        flightNum = (String) requestParams.get("flightNum");
        return "select";
    }

    public void typeChanged(ValueChangeEvent event) {
        if ("Roundtrip".equals(event.getNewValue().toString())) {
            setTripType("Roundtrip");
        } else {
            setTripType("One Way");
        }
        FacesContext.getCurrentInstance().renderResponse();
    }
}
