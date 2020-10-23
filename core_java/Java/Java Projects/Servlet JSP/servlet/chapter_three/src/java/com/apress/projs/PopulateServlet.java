package com.apress.projs;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PopulateServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        Person p = new Person();
        p.setName("Sam");
        p.setAge(26);
        Address a= new Address();
        a.setLine1("331b Baker Street");
        a.setTown("London");
        a.setCountry("Greater London");
        a.setPostcode("NW1 1AA");
        
        ArrayList al = new ArrayList();
        PhoneNumber pn = new PhoneNumber();
        pn.setStd("01938");
        pn.setStd("654527");
        al.add(pn);
        
        pn = new PhoneNumber();
        pn.setStd("0208");
        pn.setStd("8764789");
        al.add(pn);
        a.setPhoneNumbers(al);
        p.setAddress(a);
    }
}
