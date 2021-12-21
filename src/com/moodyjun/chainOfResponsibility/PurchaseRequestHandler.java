package com.moodyjun.chainOfResponsibility;

public abstract class PurchaseRequestHandler {
    protected PurchaseRequestHandler nextHandler;
    abstract void handleRequest(PurchaseRequest purchaseRequest);

    public void setNextHandler(PurchaseRequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
