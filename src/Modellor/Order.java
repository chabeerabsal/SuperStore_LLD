package Modellor;

import java.util.List;

public class Order {

        private String orderId;
        private User buyer;
        private List<Product> items;
        private double totalAmount;

        public Order(String orderId, User buyer, List<Product> items, double totalAmount) {
            this.orderId = orderId;
            this.buyer = buyer;
            this.items = items;
            this.totalAmount = totalAmount;
        }

        public String getOrderId() {
            return orderId;
        }

        public double getTotalAmount() {
            return totalAmount;
        }

        @Override
        public String toString() {
            return "Order ID: " + orderId + ", Total: ₹" + totalAmount;
        }
    }


