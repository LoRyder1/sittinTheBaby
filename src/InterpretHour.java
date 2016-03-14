
public class InterpretHour {

    private static final int BEDTIME = 22;
    private static final int MIDNIGHT = 24;
    private final int hour;

    public InterpretHour(int hour) {
        this.hour = hour;
    }


    public boolean beforeBedtime() {
        return hour < BEDTIME;
    }

    public boolean beforeMidnight() {
        return hour < MIDNIGHT;
    }
}
