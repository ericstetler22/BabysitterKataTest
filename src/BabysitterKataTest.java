import com.babysitter.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BabysitterKataTest {

    @Test
    public void acceptsTimeIndexEntriesForFutureUse() {
        TimeIndex timeIndex = new TimeIndex();
        assertEquals(1, timeIndex.time("05PM"));
        assertEquals(0, timeIndex.time("03PM"));
    }

    @Test
    public void acceptsAStartTimeWithExclusions() {
        StartTime startTime = new StartTime();
        assertEquals("That is a valid start time", startTime.start("05PM"));
        assertEquals("Error!  That is an invalid start time", startTime.start("03PM"));
    }

    @Test
    public void acceptsAEndTimeWithExclusions() {
        EndTime endTime = new EndTime();
        assertEquals("That is a valid end time", endTime.end("05PM","04AM"));
        assertEquals("That is an invalid end time, you cannot end before you start", endTime.end("09PM", "05PM"));
        assertEquals("That is an invalid end time", endTime.end("05PM","05AM"));
    }

    @Test
    public void acceptsCalculationFamilyAPayment() {
        FamilyAPay familyAPay = new FamilyAPay();
        assertEquals(190, familyAPay.familyAPayment("05PM", "04AM"));
        assertEquals(100, familyAPay.familyAPayment("11PM", "04AM"));
    }

    @Test
    public void acceptsCalculationsForFamilyBPayment() {
        FamilyBPay familyBPay = new FamilyBPay();
        assertEquals(140, familyBPay.familyBPayment("05PM", "04AM"));
        assertEquals(80, familyBPay.familyBPayment("10PM", "04AM"));
        assertEquals(76, familyBPay.familyBPayment("05PM", "12PM"));
        assertEquals(52, familyBPay.familyBPayment("05PM", "09PM"));
    }

    @Test
    public void acceptsCalculationsForFamilyCPayment() {
        FamilyCPay familyCPay = new FamilyCPay();
        assertEquals(189, familyCPay.familyCPayment("05PM", "04AM"));
        assertEquals(75, familyCPay.familyCPayment("11PM", "04AM"));
    }

    @Test
    public void acceptsCalculationsWhenPassingStartTimeEndTimeAndFamily() {
        BabysitterCalculation babysitterCalculation = new BabysitterCalculation();
        assertEquals(190, babysitterCalculation.babysitterPayment("05PM", "04AM", "A"));
        assertEquals(140, babysitterCalculation.babysitterPayment("05PM", "04AM", "B"));
        assertEquals(189, babysitterCalculation.babysitterPayment("05PM", "04AM", "C"));

    }
}
