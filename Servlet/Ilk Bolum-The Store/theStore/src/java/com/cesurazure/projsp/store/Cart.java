package com.cesurazure.projsp.store;

import java.util.HashMap;
import java.util.Iterator;

public class Cart {

    private HashMap items = new HashMap();

    public Cart() {
    }

    public Iterator getItems() {
        return items.values().iterator();
    }

    public void addItem(Product product) throws ItemAlreadyAddedException {
        Integer id = new Integer(product.getId());
        if (this.items.containsKey(id)) {
            throw new ItemAlreadyAddedException();
        }
        this.items.put(id, product);
    }
}
