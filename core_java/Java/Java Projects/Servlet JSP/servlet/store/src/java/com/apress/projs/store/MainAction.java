package com.apress.projs.store;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainAction implements Action {

    public String process(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {
        return "/main.jsp";
    }
}
