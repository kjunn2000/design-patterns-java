package com.moodyjun.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest("PR0001", "Item", 100000);
        VicePresidentHandler vicePresidentHandler = new VicePresidentHandler();
        RegionalDirectorHandler regionalDirectorHandler = new RegionalDirectorHandler();
        BranchManagerHandler branchManagerHandler = new BranchManagerHandler();
        branchManagerHandler.setNextHandler(regionalDirectorHandler);
        regionalDirectorHandler.setNextHandler(vicePresidentHandler);
        branchManagerHandler.handleRequest(purchaseRequest);
    }
}
