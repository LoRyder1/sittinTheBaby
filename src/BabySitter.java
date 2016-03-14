
public class BabySitter {


    private final int startTime;
    private final int endTIme;

    public BabySitter(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTIme = endTime;
    }

    public boolean valid() {
        if (startTime >= 17) {
            return true;
        }
        return false;
    }
}
