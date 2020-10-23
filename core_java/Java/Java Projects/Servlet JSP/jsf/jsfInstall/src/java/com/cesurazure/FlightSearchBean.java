package com.cesurazure;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class FlightSearchBean {

    private FlightSearch flightSearch;// assume as a model

    public FlightSearch getFlightSearch() {
        if (flightSearch == null) {
            flightSearch = new FlightSearch();
        }
        return flightSearch;
    }
}
