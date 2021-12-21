package com.moodyjun.chainOfResponsibility;

public class PurchaseRequest {
    private String id;
    private String description;
    private int amount;

    public PurchaseRequest(String id, String description, int amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
