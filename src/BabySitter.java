
public class BabySitter {

    private final int startTime;
    private final int endTime;

    public BabySitter(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public boolean valid() {
        return startTime >= 17 && endTime <= 28;
    }


}
