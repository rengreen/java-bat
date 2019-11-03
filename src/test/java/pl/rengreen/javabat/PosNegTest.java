package pl.rengreen.javabat;

/*
posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
posNeg(-4, -5, false) → false
posNeg(-4, 5, false) → true
posNeg(-4, 5, true) → false
posNeg(1, 1, false) → false
posNeg(-1, -1, false) → false
posNeg(1, -1, true) → false
posNeg(-1, 1, true) → false
posNeg(1, 1, true) → false
posNeg(-1, -1, true) → true
posNeg(5, -5, false) → true
posNeg(-6, 6, false) → true
posNeg(-5, -6, false) → false
posNeg(-2, -1, false) → false
posNeg(1, 2, false) → false
posNeg(-5, 6, true) → false
posNeg(-5, -5, true) → true
*/

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PosNegTest {

    private PosNeg posNeg = new PosNeg();

    @Test
    public void ShouldReturnTrue_WhenNumbersHaveDifferentSignsAndNegativeIsFalse() {
        assertTrue(posNeg.posNeg(1, -1, false));
        assertTrue(posNeg.posNeg(-1, 1, false));
        assertTrue(posNeg.posNeg(-4, 5, false));
        assertTrue(posNeg.posNeg(5, -5, false));
        assertTrue(posNeg.posNeg(-6, 6, false));
    }

    @Test
    public void ShouldReturnFalse_WhenNumbersHaveEqualSignsAndNegativeIsFalse() {
        assertFalse(posNeg.posNeg(-4, -5, false));
        assertFalse(posNeg.posNeg(1, 1, false));
        assertFalse(posNeg.posNeg(-1, -1, false));
        assertFalse(posNeg.posNeg(-5, -6, false));
        assertFalse(posNeg.posNeg(-2, -1, false));
        assertFalse(posNeg.posNeg(1, 2, false));
    }

    @Test
    public void ShouldReturnTrue_WhenBothNumbersAreNegativeAndNegativeIsTrue() {
        assertTrue(posNeg.posNeg(-4, -5, true));
        assertTrue(posNeg.posNeg(-1, -1, true));
        assertTrue(posNeg.posNeg(-5, -5, true));
    }

    @Test
    public void ShouldReturnFalse_WhenAnyNumberIsNotNegativeAndNegativeIsTrue() {
        assertFalse(posNeg.posNeg(-4, 5, true));
        assertFalse(posNeg.posNeg(1, -1, true));
        assertFalse(posNeg.posNeg(-1, 1, true));
        assertFalse(posNeg.posNeg(1, 1, true));
        assertFalse(posNeg.posNeg(-5, 6, true));
    }
}