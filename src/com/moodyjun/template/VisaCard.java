package com.moodyjun.template;

public class VisaCard extends CreditCardValidator{
    @Override
    public boolean validateLength() {
//        validate length
        return true;
    }

    @Override
    public boolean validatePrefix() {
//        validate prefix
        return true;
    }
}
