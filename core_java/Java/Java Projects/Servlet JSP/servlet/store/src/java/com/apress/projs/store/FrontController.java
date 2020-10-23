package com.apress.projs.store;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {

    public void init() throws ServletException {
        HashMap products = new HashMap();
        Product p = new Product(1, "Dog", "99.99");
        products.put("1", p);
        p = new Product(2, "Cst", "4.99");
        products.put("2", p);
        p = new Product(3, "Fish", "1.99");
        products.put("3", p);

        getServletContext().setAttribute("products", products);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        String name = req.getPathInfo().substring(1); //ask

        String viewName = "/error.jsp";
        try {
            name = "com.apress.projs.store." + name;
            Class c = getClass().getClassLoader().loadClass(name);
            Action action = (Action) c.newInstance();
            viewName = action.process(req, res);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
    }
}
