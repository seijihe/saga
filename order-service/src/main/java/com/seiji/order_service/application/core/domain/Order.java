package com.seiji.order_service.application.core.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private String id;
    private List<OrderProduct> products;
    private LocalDateTime createAt;
    private String transactionId;
    private Double totalAmount;
    private Integer totalItems;

    public Order(String id, List<OrderProduct> products, LocalDateTime createAt, String transactionId,
            Double totalAmount, Integer totalItems) {
        this.id = id;
        this.products = products;
        this.createAt = createAt;
        this.transactionId = transactionId;
        this.totalAmount = totalAmount;
        this.totalItems = totalItems;
    }

    public Order(Builder builder) {
        this.id = builder.id;
        this.products = builder.products;
        this.createAt = builder.createAt;
        this.transactionId = builder.transactionId;
        this.totalAmount = builder.totalAmount;
        this.totalItems = builder.totalItems;
    }

    public static class Builder {

        private String id;
        private List<OrderProduct> products;
        private LocalDateTime createAt;
        private String transactionId;
        private double totalAmount;
        private int totalItems;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder products(List<OrderProduct> products) {
            this.products = products;
            return this;
        }

        public Builder createAt(LocalDateTime createAt) {
            this.createAt = createAt;
            return this;
        }

        public Builder transactionalId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public Builder totalAmount(Double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        public Order build() {
            return new Order(this);
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<OrderProduct> getProducts() {
        return products;
    }

    public void setProducts(List<OrderProduct> products) {
        this.products = products;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }
    
}
