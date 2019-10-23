package pl.rengreen.javabat;

/*
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
sumDouble(-1, 0) → -1
sumDouble(3, 3) → 12
sumDouble(0, 0) → 0
sumDouble(0, 1) → 1
sumDouble(3, 4) → 7
*/

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumDoubleTest {

    private SumDouble sumDouble = new SumDouble();

    @Test
    public void ShouldReturnSum_WhenTwoDifferentNumbers() {
        assertEquals(3, sumDouble.sumDouble(1, 2));
        assertEquals(5, sumDouble.sumDouble(3, 2));
        assertEquals(-1, sumDouble.sumDouble(-1, 0));
        assertEquals(1, sumDouble.sumDouble(0, 1));
        assertEquals(7, sumDouble.sumDouble(3, 4));
    }

    @Test
    public void ShouldReturnDoubleSum_WhenTwoEqualNumbers() {
        assertEquals(8, sumDouble.sumDouble(2, 2));
        assertEquals(12, sumDouble.sumDouble(3, 3));
        assertEquals(0, sumDouble.sumDouble(0, 0));
    }

}
