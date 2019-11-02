package pl.rengreen.javabat;

/*
parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
parrotTrouble(true, 21) → true
parrotTrouble(false, 21) → false
parrotTrouble(false, 20) → falseX
parrotTrouble(true, 23) → true
parrotTrouble(false, 23) → false
parrotTrouble(true, 20) → false
parrotTrouble(false, 12) → false
*/

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParrotTroubleTest {

    private ParrotTrouble parrotTrouble = new ParrotTrouble();

    @Test
    public void ShouldReturnTrue_WhenTalkingBefore7() {
        assertTrue(parrotTrouble.parrotTrouble(true, 6));
    }

    @Test
    public void ShouldReturnTrue_WhenTalkingAfter20() {
        assertTrue(parrotTrouble.parrotTrouble(true, 21));
        assertTrue(parrotTrouble.parrotTrouble(true, 23));
    }

    @Test
    public void ShouldReturnFalse_WhenTalkingBetween7And20() {
        assertFalse(parrotTrouble.parrotTrouble(true, 7));
        assertFalse(parrotTrouble.parrotTrouble(true, 20));
    }

    @Test
    public void ShouldReturnFalse_WhenNotTalking() {
        assertFalse(parrotTrouble.parrotTrouble(false, 6));
        assertFalse(parrotTrouble.parrotTrouble(false, 21));
        assertFalse(parrotTrouble.parrotTrouble(false, 20));
        assertFalse(parrotTrouble.parrotTrouble(false, 23));
        assertFalse(parrotTrouble.parrotTrouble(false, 12));
    }

}