package com.moodyjun.chainOfResponsibility;

public class VicePresidentHandler extends PurchaseRequestHandler{

    @Override
    public void handleRequest(PurchaseRequest pr) {
        if(pr.getAmount()<= 200000) {
            System.out.println(pr.getId()+ "is under $200000 > approved");
        }else {
            if (nextHandler == null) {
                System.out.println("Please call customer service");
                return;
            }
            nextHandler.handleRequest(pr);
        }
    }
}
