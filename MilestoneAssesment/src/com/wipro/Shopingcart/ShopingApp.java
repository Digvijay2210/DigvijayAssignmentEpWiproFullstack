package com.wipro.Shopingcart;

import java.util.LinkedList;

public class ShopingApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        PurchaseHistory history = new PurchaseHistory();
        CustomerService service = new CustomerService();

        // Shopping cart operations
        cart.addItem("Laptop");
        cart.addItem("Smartphone");
        cart.viewCart();
        cart.removeItem("Smartphone");
        cart.viewCart();

        // Save the current cart to purchase history upon checkout
        history.saveCart(cart.getCart());
        cart.addItem("Headphones");
        cart.viewCart();
        history.saveCart(cart.getCart());

        // View purchase history
        history.viewHistory();

        // Undo last purchase
        LinkedList<String> lastCart = history.undoLastPurchase();
        System.out.println("Last cart restored: " + lastCart);

        // Customer service operations
        service.addRequest("Help with order #123");
        service.addRequest("Return request for order #124");
        service.viewPendingRequests();
        service.processNextRequest();
        service.viewPendingRequests();
    }
}
