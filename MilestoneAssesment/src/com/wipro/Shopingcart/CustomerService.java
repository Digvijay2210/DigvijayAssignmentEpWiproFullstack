package com.wipro.Shopingcart;
import java.util.LinkedList;
import java.util.Queue;

class CustomerService {
    private Queue<String> serviceRequests;

    public CustomerService() {
        this.serviceRequests = new LinkedList<>();
    }

    // Method to add a customer service request
    public void addRequest(String request) {
        serviceRequests.add(request);
        System.out.println("Customer service request added: " + request);
    }

    // Method to process the next customer service request
    public void processNextRequest() {
        if (!serviceRequests.isEmpty()) {
            String request = serviceRequests.poll();
            System.out.println("Processing request: " + request);
        } else {
            System.out.println("No pending customer service requests.");
        }
    }

    // Method to view pending customer service requests
    public void viewPendingRequests() {
        if (serviceRequests.isEmpty()) {
            System.out.println("No pending customer service requests.");
        } else {
            System.out.println("Pending Customer Service Requests: " + serviceRequests);
        }
    }
}
