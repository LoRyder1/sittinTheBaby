
public class BabySitter {

    private static final int BEDTIME = 22;
    private static final int MIDNIGHT = 24;
    private static final int BASIC_RATE = 12;
    private static final int AFTER_BEDTIME_RATE = 8;
    private static final int AFTER_MIDNIGHT_RATE = 16;
    private final int startTime;
    private final int endTime;
    private int total;

    public BabySitter(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public boolean valid() {
        return startTime >= 17 && endTime <= 28;
    }


    public int calculatePay() {
        for(int hour = startTime; hour < endTime; hour++) {
            matchRateForHour(hour);
        }
        return total;
    }

    private void matchRateForHour(int hour) {
        if (hour < BEDTIME) {
            total += BASIC_RATE;
        } else if (hour < MIDNIGHT) {
            total += AFTER_BEDTIME_RATE;
        } else {
            total += AFTER_MIDNIGHT_RATE;
        }
    }
}
