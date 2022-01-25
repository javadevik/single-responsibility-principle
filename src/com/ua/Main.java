package com.ua;

import com.ua.model.Order;
import com.ua.model.Product;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1L, "Igor", "igor@gmail.com", 99.9);
        order.setProductSet(Collections.singleton(new Product(0L, "Toy")));
        OrderProcessor.process(order);
    }
}
