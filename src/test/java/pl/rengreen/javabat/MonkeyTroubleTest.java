package pl.rengreen.javabat;

/*
monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
monkeyTrouble(false, true) → false

*/

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MonkeyTroubleTest {

    private MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

    @Test
    public void ShouldReturnTrue_WhenBothAreSmiling() {
        assertTrue(monkeyTrouble.monkeyTrouble(true, true));
    }

    @Test
    public void ShouldReturnTrue_WhenNoneIsSmiling() {
        assertTrue(monkeyTrouble.monkeyTrouble(false, false));
    }

    @Test
    public void ShouldReturnFalse_WhenOnlyFirstIsSmiling() {
        assertFalse(monkeyTrouble.monkeyTrouble(true, false));
    }

    @Test
    public void ShouldReturnFalse_WhenOnlySecondIsSmiling() {
        assertFalse(monkeyTrouble.monkeyTrouble(false, true));
    }
}
