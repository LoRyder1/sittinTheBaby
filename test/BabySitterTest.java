import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BabySitterTest {

    private BabySitter sitting;

    private void setSchedule(int startTime, int endTime) {
        sitting = new BabySitter(startTime, endTime);
    }

    @Test
    public void sittingBeginsNoEarlierThan5PM() {
        setSchedule(17, 28);
        assertEquals(true, sitting.valid());
    }

    @Test
    public void sittingBeginsNoEarlierThan5PMReturnsFalse() {
        setSchedule(16, 28);
        assertEquals(false, sitting.valid());
    }

    @Test
    public void sittingEndsAfter4AMReturnsFalse() {
        setSchedule(17, 29);
        assertEquals(false, sitting.valid());
    }

    @Test
    public void sittingForOneHourAtBasicRateReturns12() {
        setSchedule(17, 18);
        assertEquals(12, sitting.calculatePay());
    }

    @Test
    public void sittingForOneHourAtAfterBedtimRateReturns8() {
        setSchedule(22, 23);
        assertEquals(8, sitting.calculatePay());
    }
}
