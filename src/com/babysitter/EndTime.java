package com.babysitter;

public class EndTime {

    public static int endTimeIndexNumber;

    public String end(String inputStartTime, String inputEndTime) {
        TimeIndex timeIndex = new TimeIndex();
        int endTimeIndexNumber = timeIndex.time(inputEndTime);
        StartTime.startTimeIndexNumber = timeIndex.time(inputStartTime);

        if ((endTimeIndexNumber > 0) && (endTimeIndexNumber > StartTime.startTimeIndexNumber)) {
            return "That is a valid end time";
        }else if ((endTimeIndexNumber < StartTime.startTimeIndexNumber) && (endTimeIndexNumber > 0)) {
            return "That is an invalid end time, you cannot end before you start";
        } else {
            return "That is an invalid end time";
        }

    }
}
