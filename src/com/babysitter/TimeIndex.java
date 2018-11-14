package com.babysitter;

public class TimeIndex {
    public static int time(String inputTime) {

        int timeIndexNumber;
        switch (inputTime) {
            case "05PM":
                timeIndexNumber = 1;
                break;
            case "06PM":
                timeIndexNumber = 2;
                break;
            case "07PM":
                timeIndexNumber = 3;
                break;
            case "08PM":
                timeIndexNumber = 4;
                break;
            case "09PM":
                timeIndexNumber = 5;
                break;
            case "10PM":
                timeIndexNumber = 6;
                break;
            case "11PM":
                timeIndexNumber = 7;
                break;
            case "12PM":
                timeIndexNumber = 8;
                break;
            case "01AM":
                timeIndexNumber = 9;
                break;
            case "02AM":
                timeIndexNumber = 10;
            case "03AM":
                timeIndexNumber = 11;
                break;
            case "04AM":
                timeIndexNumber = 12;
                break;
            default:
                timeIndexNumber = 0;
                break;
        }
        return timeIndexNumber;
    }
}
