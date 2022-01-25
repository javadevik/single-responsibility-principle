package com.ua;

import com.ua.model.Order;
import com.ua.repository.OrderRepository;

public class OrderProcessor {

    private final static OrderRepository repository = new OrderRepository();
    private final static ConfirmationEmailSender confirmationEmailSender = new ConfirmationEmailSender();

    public static boolean process(Order order) {
        if (order.isValid() && repository.save(order)) {
            confirmationEmailSender.sendConfirmationEmail(order);
            System.out.println("Please, confirm your order on email");
            return true;
        }
        return false;
    }
}
