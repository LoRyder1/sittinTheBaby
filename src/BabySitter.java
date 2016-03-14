
public class BabySitter {

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
            if (hour < 22) {
                total += 12;
            } else if (hour < 24) {
                total += 8;
            }
        }
        return total;
    }
}
