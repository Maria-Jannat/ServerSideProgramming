package com.apress.projs.store;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckoutAction implements Action {

    @Override
    public String process(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {
        return "/checkout.jsp";
    }
}
