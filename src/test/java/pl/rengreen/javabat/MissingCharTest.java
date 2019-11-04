package pl.rengreen.javabat;

/*
missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
missingChar("Hi", 0) → "i"
missingChar("Hi", 1) → "H"
missingChar("code", 0) → "ode"
missingChar("code", 1) → "cde"
missingChar("code", 2) → "coe"
missingChar("code", 3) → "cod"
missingChar("chocolate", 8) → "chocolat"
*/

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingCharTest {

    private MissingChar missingChar = new MissingChar();

    @Test
    public void ShouldReturnStringWithoutOneCharacter_WhenCharacterPositionIsGiven() {
        assertEquals("ktten", missingChar.missingChar("kitten", 1));
        assertEquals("itten", missingChar.missingChar("kitten", 0));
        assertEquals("kittn", missingChar.missingChar("kitten", 4));
        assertEquals("i", missingChar.missingChar("Hi", 0));
        assertEquals("H", missingChar.missingChar("Hi", 1));
        assertEquals("ode", missingChar.missingChar("code", 0));
        assertEquals("cde", missingChar.missingChar("code", 1));
        assertEquals("coe", missingChar.missingChar("code", 2));
        assertEquals("cod", missingChar.missingChar("code", 3));
        assertEquals("chocolat", missingChar.missingChar("chocolate", 8));

    }

}