package com.babysitter;

public class StartTime {
    public static int startTimeIndexNumber;

    public static String start(String inputStartTime) {
        TimeIndex timeIndex = new TimeIndex();
        int startTimeIndexNumber = timeIndex.time(inputStartTime);

        if (startTimeIndexNumber > 0) {
            return "That is a valid start time";
        } else {
            return "Error!  That is an invalid start time";
        }


    }
}
