package pl.rengreen.javabat;

/*
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
diff21(22) → 2
diff21(25) → 8
diff21(30) → 18
diff21(0) → 21
diff21(1) → 20
diff21(2) → 19
diff21(-1) → 22
diff21(-2) → 23
diff21(50) → 58
*/

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Diff21Test {

    private Diff21 diff21 = new Diff21();

    @Test
    public void ShouldReturnAbsoluteDifference_WhenNumberNotBiggerThan21() {
        assertEquals(2, diff21.diff21(19));
        assertEquals(11, diff21.diff21(10));
        assertEquals(0, diff21.diff21(21));
        assertEquals(21, diff21.diff21(0));
        assertEquals(20, diff21.diff21(1));
        assertEquals(19, diff21.diff21(2));
        assertEquals(22, diff21.diff21(-1));
        assertEquals(23, diff21.diff21(-2));
    }

    @Test
    public void ShouldReturnDoubleAbsoluteDifference_WhenNumberOverThan21() {
        assertEquals(2, diff21.diff21(22));
        assertEquals(8, diff21.diff21(25));
        assertEquals(18, diff21.diff21(30));
        assertEquals(58, diff21.diff21(50));
    }
}