package com.moodyjun.chainOfResponsibility;

public class RegionalDirectorHandler extends PurchaseRequestHandler{

    @Override
    public void handleRequest(PurchaseRequest pr) {
        if(pr.getAmount()<= 100000) {
            System.out.println(pr.getId()+ "is under $100000 > approved");
        }else {
            if (nextHandler == null) {
                System.out.println("Please call customer service");
                return;
            }
            nextHandler.handleRequest(pr);
        }
    }
}
