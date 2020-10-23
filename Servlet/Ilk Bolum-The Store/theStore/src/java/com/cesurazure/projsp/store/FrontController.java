package com.cesurazure.projsp.store;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {

    public void init() throws ServletException {
        HashMap products = new HashMap();

        Product p = new Product(1, "Kopek", "9.99");
        products.put("1", p);

        p = new Product(2, "Kedi", "4.99");
        products.put("2", p);

        p = new Product(2, "Kus", "4.99");
        products.put("3", p);

        getServletContext().setAttribute("products", products);

    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getPathInfo().substring(1);

        String viewName = "/error.jsp";
        try {
            name = "com.cesurazure.projsp.store." + name;
            Class c = getClass().getClassLoader().loadClass(name);
            Action action = (Action) c.newInstance();
            viewName = action.process(req, res);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher(viewName);
        dispatcher.forward(req, res);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doPost(req, res);
    }
}
