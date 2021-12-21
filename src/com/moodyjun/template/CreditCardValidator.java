package com.moodyjun.template;

public abstract class CreditCardValidator {
//    template method
    public final boolean isValid(){
        if (!validateExpirationDate()){
            System.out.println("Invalid expiration date");
            return false;
        }
        if (!validateCharacters()){
            System.out.println("Invalid characters");
            return false;
        }
        if (!validateLength()){
            System.out.println("Invalid length");
            return false;
        }
        if (!validatePrefix()){
            System.out.println("Invalid prefix");
            return false;
        }
        return true;
    }

    public boolean validateExpirationDate(){
//        validate date
        return true;
    };

    public boolean validateCharacters(){
//        validate characters
        return true;
    };

    public abstract boolean validateLength();

    public abstract boolean validatePrefix();
}
