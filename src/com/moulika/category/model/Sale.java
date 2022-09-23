package com.moulika.category.model;

public class Sale {
    private int productId;
    private  int leafCategoryId;
    private  int primaryCategoryId;
    private double amount;
    private double quantity;

    public int getProductId() {
        return productId;
    }

    public int getLeafCategoryId() {
        return leafCategoryId;
    }

    public int getPrimaryCategoryId() {
        return primaryCategoryId;
    }

    public double getAmount() {
        return amount;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setLeafCategoryId(int leafCategoryId) {
        this.leafCategoryId = leafCategoryId;
    }

    public void setPrimaryCategoryId(int primaryCategoryId) {
        this.primaryCategoryId = primaryCategoryId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public Sale(int productId, int leafCategoryId, int primaryCategoryId, int amount, int quantity) {
        this.productId = productId;
        this.leafCategoryId = leafCategoryId;
        this.primaryCategoryId = primaryCategoryId;
        this.amount = amount;
        this.quantity = quantity;
    }

    public Sale() {
        super();
    }

    @Override
    public String toString() {
        return "Sale{" +
                "productId=" + productId +
                ", leafCategoryId=" + leafCategoryId +
                ", primaryCategoryId=" + primaryCategoryId +
                ", amount=" + amount +
                ", quantity=" + quantity +
                '}';
    }
}
