package test;

import org.junit.Test;

import static main.BalancedBrackets.hasBalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void areThereLeftAndRightBrackets() {
        assertEquals(true, hasBalancedBrackets("[Some String]"));
    }
    @Test
    public void missingABracket() {
        assertFalse(hasBalancedBrackets("[Some String"));
    }
    @Test
    public void bracketsInsideOfBrackets() {
        assertEquals(true, hasBalancedBrackets("[Some [] String]"));
    }
    @Test
    public void multiplePairsOfBrackets() {
        assertEquals(true, hasBalancedBrackets("[Some] [] [String]"));
    }
    @Test
    public void onlyLeftOneBracket() {
        assertFalse(hasBalancedBrackets("["));
    }
    @Test
    public void onlyRightOneBracket() {
        assertFalse(hasBalancedBrackets("]"));
    }

    @Test
    public void stringBeforeBrackets() {
        assertTrue(hasBalancedBrackets("Some String[]"));
    }
    @Test
    public void stringAfterBrackets() {
        assertTrue(hasBalancedBrackets("[]Some String"));
    }

}
