package com.babysitter;

public class BabysitterCalculation {

    public int babysitterPayment(String inputStartTime, String inputEndTime, String inputFamily) {

        int finalBabysitterCalculation = 0;
        switch(inputFamily) {
            case "A":
                finalBabysitterCalculation = FamilyAPay.familyAPayment(inputStartTime, inputEndTime);
                break;
            case "B":
                finalBabysitterCalculation = FamilyBPay.familyBPayment(inputStartTime, inputEndTime);
                break;
            case "C":
                finalBabysitterCalculation = FamilyCPay.familyCPayment(inputStartTime, inputEndTime);
                break;
        }
        return finalBabysitterCalculation;
    }
}
