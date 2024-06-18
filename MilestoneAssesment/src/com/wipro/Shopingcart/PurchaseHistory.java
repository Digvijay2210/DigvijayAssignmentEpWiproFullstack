package com.wipro.Shopingcart;
import java.util.LinkedList;
import java.util.Stack;

class PurchaseHistory {
    private Stack<LinkedList<String>> history;

    public PurchaseHistory() {
        this.history = new Stack<>();
    }

    // Method to save the current cart to purchase history
    public void saveCart(LinkedList<String> cart) {
        // Save a copy of the cart
        history.push(new LinkedList<>(cart));
        System.out.println("Cart saved to purchase history.");
    }

    // Method to undo the last purchase (retrieve the last cart)
    public LinkedList<String> undoLastPurchase() {
        if (!history.isEmpty()) {
            System.out.println("Undoing last purchase.");
            return history.pop();
        } else {
            System.out.println("No purchase history to undo.");
            return new LinkedList<>();
        }
    }

    // Method to view the entire purchase history
    public void viewHistory() {
        if (history.isEmpty()) {
            System.out.println("No purchase history available.");
        } else {
            System.out.println("Purchase History:");
            for (LinkedList<String> cart : history) {
                System.out.println(cart);
            }
        }
    }
}
