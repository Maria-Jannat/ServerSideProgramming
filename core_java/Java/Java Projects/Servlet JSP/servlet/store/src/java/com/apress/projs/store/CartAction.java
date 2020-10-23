package com.apress.projs.store;

import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CartAction {

    public String process(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        String adding = request.getParameter("add");

        HttpSession session = request.getSession();

        Cart cart = (Cart) session.getAttribute("cart");

        if (cart == null) {
            cart = new Cart();
        }

        if (adding.equalsIgnoreCase("true")) {
            addToCart(request, cart);
        }

        return "/cart.jap";
    }

    private void addToCart(HttpServletRequest request, Cart cart)
            throws ItemAlreadyAddedException {
        HashMap products = (HashMap) request.getSession().getServletContext().getAttribute("products");
        try {
            String id = request.getParameter("id");
            Product p = (Product) products.get(id);

            cart.addItem(p);
            request.getSession().setAttribute("cart", cart);
        } catch (NumberFormatException e) {
            throw new ItemAlreadyAddedException();
        }
    }

}