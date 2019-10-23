package pl.rengreen.javabat;

/*
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
sleepIn(true, true) → true
*/

import org.junit.Test;
import pl.rengreen.javabat.SleepIn;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SleepInTest {

    private SleepIn sleepIn = new SleepIn();

    @Test
    public void ShouldReturnTrue_WhenNotWeekdayAndNotVacation() {
        assertTrue(sleepIn.sleepIn(false, false));
    }

    @Test
    public void ShouldReturnFalse_WhenWeekdayAndNotVacation() {
        assertFalse(sleepIn.sleepIn(true, false));
    }

    @Test
    public void ShouldReturnTrue_WhenNotWeekdayAndVacation() {
        assertTrue(sleepIn.sleepIn(false, true));
    }

    @Test
    public void ShouldReturnTrue_WhenWeekdayAndVacation() {
        assertTrue(sleepIn.sleepIn(true, true));
    }
}
