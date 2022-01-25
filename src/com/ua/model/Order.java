package com.ua.model;

import java.util.HashSet;
import java.util.Set;

public class Order {
    private Long id;
    private String customerName;
    private String customerEmail;
    private double price;
    private Set<Product> productSet;

    public Order(Long id, String customerName, String customerEmail, double price) {
        this.id = id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.price = price;
        this.productSet = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }

    public boolean isValid() {
        return id != null &&
                customerName != null &&
                customerEmail !=null &&
                price > 0 && !productSet.isEmpty();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", price=" + price +
                ", productSet=" + productSet +
                '}';
    }
}
