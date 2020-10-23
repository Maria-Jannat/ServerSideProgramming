package com.apress.projs;

import java.util.Collection;

public class Address {

    private String line1;
    private String town;
    private String country;
    private String postcode;
    private Collection phoneNumbers;
    
    

    public Address() {
        this.line1 = line1;
        this.town = town;
        this.country = country;
        this.postcode = postcode;
        this.phoneNumbers = phoneNumbers;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Collection getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Collection phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

}
