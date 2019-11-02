package pl.rengreen.javabat;

/*
nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
nearHundred(110) → true
nearHundred(111) → false
nearHundred(121) → false
nearHundred(-101) → false
nearHundred(-209) → false
nearHundred(190) → true
nearHundred(209) → true
nearHundred(0) → false
nearHundred(5) → false
nearHundred(-50) → false
nearHundred(191) → true
nearHundred(189) → false
nearHundred(200) → true
nearHundred(210) → true
nearHundred(211) → false
nearHundred(290) → false
*/

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NearHundredTest {
    private NearHundred nearHundred = new NearHundred();

    @Test
    public void ShouldReturnTrue_WhenIsBetween90And110Inclusive() {
        assertTrue(nearHundred.nearHundred(93));
        assertTrue(nearHundred.nearHundred(90));
        assertTrue(nearHundred.nearHundred(100));
    }

    @Test
    public void ShouldReturnTrue_WhenIsBetween190And210Inclusive() {
        assertTrue(nearHundred.nearHundred(190));
        assertTrue(nearHundred.nearHundred(209));
        assertTrue(nearHundred.nearHundred(191));
        assertTrue(nearHundred.nearHundred(200));
        assertTrue(nearHundred.nearHundred(210));
    }

    @Test
    public void ShouldReturnFalse_WhenIsLesserThan90() {
        assertFalse(nearHundred.nearHundred(89));
        assertFalse(nearHundred.nearHundred(-101));
        assertFalse(nearHundred.nearHundred(-209));
        assertFalse(nearHundred.nearHundred(0));
        assertFalse(nearHundred.nearHundred(5));
        assertFalse(nearHundred.nearHundred(-50));
    }

    @Test
    public void ShouldReturnFalse_WhenIsBetween110And190Exclusive() {
        assertFalse(nearHundred.nearHundred(111));
        assertFalse(nearHundred.nearHundred(121));
        assertFalse(nearHundred.nearHundred(189));
    }

    @Test
    public void ShouldReturnFalse_WhenIsGreaterThan210() {
        assertFalse(nearHundred.nearHundred(211));
        assertFalse(nearHundred.nearHundred(290));
    }
}