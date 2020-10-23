package com.cesurazure.domain;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class FlightSearchBean {

    private FlightSearch flightSearch;

    public FlightSearch getFlight() {
        if (flightSearch == null) {
            flightSearch = new FlightSearch();
        }
        return flightSearch;
    }

    public void setFlightSearch(FlightSearch flightSearch) {
        this.flightSearch = flightSearch;
    }

}
