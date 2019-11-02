package pl.rengreen.javabat;

/*
makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
makes10(10, 1) → true
makes10(10, 10) → true
makes10(8, 2) → true
makes10(8, 3) → false
makes10(10, 42) → true
makes10(12, -2) → true
*/

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Makes10Test {
    private Makes10 makes10 = new Makes10();

    @Test
    public void ShouldReturnTrue_WhenAnyNumberIs10() {
        assertTrue(makes10.makes10(9, 10));
        assertTrue(makes10.makes10(10, 1));
        assertTrue(makes10.makes10(10, 10));
        assertTrue(makes10.makes10(10, 42));
    }

    @Test
    public void ShouldReturnFalse_WhenSumIs10() {
        assertTrue(makes10.makes10(1, 9));
        assertTrue(makes10.makes10(8, 2));
        assertTrue(makes10.makes10(12, -2));
    }

    @Test
    public void ShouldReturnFalse_WhenSumIsNot10AndNoneIsEqual10() {
        assertFalse(makes10.makes10(9, 9));
        assertFalse(makes10.makes10(8, 3));
    }
}