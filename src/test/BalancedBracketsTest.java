package test;

import main.BalancedBrackets;
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
    //hasBalancedBracketsShouldReturnTrueWhenGivenAnEmptyArray();
    public void onlyBracketsReturnsTrue() {
        String spec = "hasBalancedBrackets() passes when given balanced brackets";
        assertTrue(spec, hasBalancedBrackets("[]"));
    }

    @Test
    //hasBalancedBracketsShouldReturnFalseWhenBracketsAreFlipped()
    public void unnestedBracketsReturnsFalse() {
        String spec = "hasBalancedBrackets() fails when given unbalanced brackets";
        assertFalse(spec, hasBalancedBrackets("]["));
    }


    //[LaunchCode[HI]]
    //string in brackets
    //string with no brackets
    //[[LaunchCode]] should be true
    //[[[[[[[[[[[[[[[
    //]]]]]]]]]]]]]]]

//  @Before / @After
//  assertEquals(spec, expected, actual, optional_delta);
//  assertFalse(spec, condition);
//  assertTrue(spec, condition);
//  assertNotNull(spec, object);

//  public void onlyBracketsReturnsFalse() {
//      String spec = "hasBalancedBrackets() fails when given unbalanced brackets";
//      Boolean expected = false;
//      Boolean actual = hasBalancedBrackets("[[");
//      assertEquals(spec, expected, actual);
//  }


}
