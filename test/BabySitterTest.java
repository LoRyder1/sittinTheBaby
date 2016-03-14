import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BabySitterTest {

    @Test
    public void sittingBeginsNoEarlierThan5PM() {
        BabySitter sitting = new BabySitter(17, 28);
        assertEquals(true, sitting.valid());
    }

    @Test
    public void sittingBeginsNoEarlierThan5PMReturnsFalse() {
        BabySitter sitting = new BabySitter(16, 28);
        assertEquals(false, sitting.valid());
    }
}
