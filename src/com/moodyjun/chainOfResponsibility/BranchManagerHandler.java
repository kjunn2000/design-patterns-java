package com.moodyjun.chainOfResponsibility;

public class BranchManagerHandler extends PurchaseRequestHandler{

    @Override
    public void handleRequest(PurchaseRequest pr) {
        if(pr.getAmount()<= 25000) {
            System.out.println(pr.getId()+ "is under $25000 -> approved");
        }else {
            if (nextHandler == null) {
                System.out.println("Please call customer service");
                return;
            }
            nextHandler.handleRequest(pr);
        }
    }
}
