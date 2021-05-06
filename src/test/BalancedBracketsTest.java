package test;

import org.junit.Test;
import main.BalancedBrackets;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void leftTextRightReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void textLeftTextRightReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void leftRightTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void spaceReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
    }

    @Test
    public void leftLeftRightRightReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }


    @Test
    public void emptyReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void leftTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void textRightReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }


    @Test
    public void textRightTextLeftReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void leftOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets( "["));
    }

    @Test
    public void leftRightReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets( "]["));
    }

    @Test
    public void leftLeftRightReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets( "]]["));
    }

    @Test
    public void leftRightRightReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets( "][["));
    }

}