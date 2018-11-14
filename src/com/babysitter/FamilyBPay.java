package com.babysitter;

public class FamilyBPay {

    public static int familyBPayment(String inputStartTime, String inputEndTime) {
        TimeIndex timeIndex = new TimeIndex();
        StartTime.startTimeIndexNumber = timeIndex.time(inputStartTime);
        EndTime.endTimeIndexNumber = timeIndex.time(inputEndTime);
        String familyBLevelOneWageEnd = "10PM";
        String familyBLevelTwoWageEnd = "12PM";
        int familyBLevelOneWageEndIndexNumber = TimeIndex.time(familyBLevelOneWageEnd);
        int familyBLevelTwoWageEndIndexNumber = TimeIndex.time(familyBLevelTwoWageEnd);
        int familyBLevelOneWage = 12;
        int familyBLevelTwoWage = 8;
        int familyBLevelThreeWage = 16;

        if ((StartTime.startTimeIndexNumber <= familyBLevelOneWageEndIndexNumber) &&
                (EndTime.endTimeIndexNumber >= familyBLevelTwoWageEndIndexNumber)) {
            return ((familyBLevelOneWageEndIndexNumber - StartTime.startTimeIndexNumber) * familyBLevelOneWage) +
                    ((familyBLevelTwoWageEndIndexNumber - familyBLevelOneWageEndIndexNumber) * familyBLevelTwoWage) +
                    ((EndTime.endTimeIndexNumber - familyBLevelTwoWageEndIndexNumber) * familyBLevelThreeWage);
        }else if ((StartTime.startTimeIndexNumber >= familyBLevelOneWageEndIndexNumber) &&
                (EndTime.endTimeIndexNumber >= familyBLevelTwoWageEndIndexNumber)) {
            return ((familyBLevelTwoWageEndIndexNumber - StartTime.startTimeIndexNumber) * familyBLevelTwoWage) +
                    ((EndTime.endTimeIndexNumber - familyBLevelTwoWageEndIndexNumber) * familyBLevelThreeWage);
        } else if ((StartTime.startTimeIndexNumber <= familyBLevelOneWageEndIndexNumber) &&
                (EndTime.endTimeIndexNumber <= familyBLevelTwoWageEndIndexNumber)){
            return ((familyBLevelOneWageEndIndexNumber - StartTime.startTimeIndexNumber) * familyBLevelOneWage) +
                    ((EndTime.endTimeIndexNumber - familyBLevelOneWageEndIndexNumber) * familyBLevelTwoWage);
        } else {
            return ((EndTime.endTimeIndexNumber - StartTime.startTimeIndexNumber) * familyBLevelTwoWage);
        }
    }
}
