package com.babysitter;

public class FamilyCPay {

    public static int familyCPayment(String inputStartTime, String inputEndTime){
        TimeIndex timeIndex = new TimeIndex();
        StartTime.startTimeIndexNumber = timeIndex.time(inputStartTime);
        EndTime.endTimeIndexNumber = timeIndex.time(inputEndTime);
        String familyCLevelOneWageEnd = "09PM";
        int familyCLevelOneWageEndIndexNumber = TimeIndex.time(familyCLevelOneWageEnd);;
        int familyCLevelOneWage = 21;
        int familyCLevelTwoWage = 15;

        if ((StartTime.startTimeIndexNumber <= familyCLevelOneWageEndIndexNumber) &&
                (EndTime.endTimeIndexNumber >= familyCLevelOneWageEndIndexNumber)) {
            return ((familyCLevelOneWageEndIndexNumber - StartTime.startTimeIndexNumber) * familyCLevelOneWage) +
                    ((EndTime.endTimeIndexNumber - familyCLevelOneWageEndIndexNumber) * familyCLevelTwoWage);
        } else {
            return (EndTime.endTimeIndexNumber - StartTime.startTimeIndexNumber) * familyCLevelTwoWage;
        }
    }
}

