package net.derpz.random_code;

import net.derpz.random_code.leetcode_stuff.problems.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    private final ValidParentheses s = new ValidParentheses();
    @Test
    public void testOne() {
        assertFalse(s.isValid("(]"));
    }

    @Test
    public void testTwo() {
        assertFalse(s.isValid("([)]"));
    }

    @Test
    public void testThree() {
        assertTrue(s.isValid("{[]}"));
    }

    @Test
    public void testObviouslyTrue() {
        assertTrue(s.isValid("()[]{}"));
    }
}
