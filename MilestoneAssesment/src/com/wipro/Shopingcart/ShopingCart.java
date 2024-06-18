package com.wipro.Shopingcart;

import java.util.LinkedList;

class ShoppingCart {
    private LinkedList<String> cart;

    public ShoppingCart() {
        this.setCart(new LinkedList<>());
    }

    // Method to add an item to the cart
    public void addItem(String item) {
        getCart().add(item);
        System.out.println(item + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String item) {
        if (getCart().remove(item)) {
            System.out.println(item + " removed from the cart.");
        } else {
            System.out.println(item + " is not in the cart.");
        }
    }

    // Method to view all items in the cart
    public void viewCart() {
        if (getCart().isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart: " + getCart());
        }
    }

	public LinkedList<String> getCart() {
		return cart;
	}

	public void setCart(LinkedList<String> cart) {
		this.cart = cart;
	}
}
