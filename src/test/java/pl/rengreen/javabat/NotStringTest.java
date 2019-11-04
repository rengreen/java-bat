package pl.rengreen.javabat;

/*
notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
notString("bad") → "not bad"
notString("not") → "not"
notString("is not") → "not is not"
notString("no") → "not no"
*/

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotStringTest {

    private NotString notString = new NotString();

    @Test
    public void ShouldPrependWithNot_WhenStringDoesNotBeginWithNot() {
        assertEquals("not candy", notString.notString("candy"));
        assertEquals("not x", notString.notString("x"));
        assertEquals("not bad", notString.notString("bad"));
        assertEquals("not is not", notString.notString("is not"));
        assertEquals("not no", notString.notString("no"));
    }

    @Test
    public void ShouldReturnOriginalString_WhenStringBeginsWithNot() {
        assertEquals("not bad", notString.notString("not bad"));
        assertEquals("not", notString.notString("not"));
    }

}