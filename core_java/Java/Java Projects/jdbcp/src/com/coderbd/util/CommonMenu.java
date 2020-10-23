package com.coderbd.util;

import com.coderbd.view.CategoryView;
import com.coderbd.view.ProductView;
import com.coderbd.view.PurchaseView;
import com.coderbd.view.SalesView;
import com.coderbd.view.SummaryView;
import com.coderbd.view.UserView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CommonMenu {
    
    public void getCommonMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
        
        JMenu file = new JMenu("File");
        JMenuItem category = new JMenuItem("Category");
        category.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               f.setVisible(false);
               new CategoryView().setVisible(true);
            }
        });
        JMenuItem product = new JMenuItem("Product");
        product.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               f.setVisible(false);
               new ProductView().setVisible(true);
            }
        });
        JMenuItem purchase = new JMenuItem("Purchase");
        purchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               f.setVisible(false);
               new PurchaseView().setVisible(true);
            }
        });
        JMenuItem sales = new JMenuItem("Sales");
        sales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               f.setVisible(false);
               new SalesView().setVisible(true);
            }
        });
        JMenuItem summary = new JMenuItem("Summary");
        summary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               f.setVisible(false);
               new SummaryView().setVisible(true);
            }
        });
        JMenuItem registration = new JMenuItem("Sign Up");
        registration.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               f.setVisible(false);
               new UserView().setVisible(true);
            }
        });
        JMenuItem logout = new JMenuItem("Logout");
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              System.exit(0);
            }
        });
        file.add(category);
        file.add(product);
        file.add(purchase);
        file.add(sales);
        file.add(summary);
        file.add(registration);
        file.add(logout);
        menuBar.add(file);
        f.setJMenuBar(menuBar);
    }
}
