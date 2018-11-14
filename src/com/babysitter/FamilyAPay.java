package com.babysitter;

public class FamilyAPay {

    public static int familyAPayment(String inputStartTime, String inputEndTime){
        TimeIndex timeIndex = new TimeIndex();
        StartTime.startTimeIndexNumber = timeIndex.time(inputStartTime);
        EndTime.endTimeIndexNumber = timeIndex.time(inputEndTime);
        String familyALevelOneWageEnd = "11PM";
        int familyALevelOneWageEndIndexNumber = TimeIndex.time(familyALevelOneWageEnd);;
        int familyALevelOneWage = 15;
        int familyALevelTwoWage = 20;

        if ((StartTime.startTimeIndexNumber <= familyALevelOneWageEndIndexNumber) &&
                (EndTime.endTimeIndexNumber >= familyALevelOneWageEndIndexNumber)) {
            return ((familyALevelOneWageEndIndexNumber - StartTime.startTimeIndexNumber) * familyALevelOneWage) +
                    ((EndTime.endTimeIndexNumber - familyALevelOneWageEndIndexNumber) * familyALevelTwoWage);
        } else {
            return (EndTime.endTimeIndexNumber - StartTime.startTimeIndexNumber) * familyALevelTwoWage;
        }
    }
}
