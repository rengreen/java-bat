package pl.rengreen.javabat;

/*
frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
frontBack("abc") → "cba"
frontBack("") → ""
frontBack("Chocolate") → "ehocolatC"
frontBack("aavJ") → "Java"
frontBack("hello") → "oellh"
*/

import org.junit.Test;

import static org.junit.Assert.*;

public class FrontBackTest {

    private FrontBack frontBack = new FrontBack();

    @Test
    public void ShouldExchangeFirstAndLastChar_WhenStringLengthIsGreaterThen2() {
        assertEquals("eodc", frontBack.frontBack("code"));
        assertEquals("ba", frontBack.frontBack("ab"));
        assertEquals("cba", frontBack.frontBack("abc"));
        assertEquals("ehocolatC", frontBack.frontBack("Chocolate"));
        assertEquals("Java", frontBack.frontBack("aavJ"));
        assertEquals("oellh", frontBack.frontBack("hello"));
    }

    @Test
    public void ShouldReturnOriginalString_WhenStringLengthIsLessThen2() {
        assertEquals("a", frontBack.frontBack("a"));
        assertEquals("", frontBack.frontBack(""));
    }

}