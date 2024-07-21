package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class ValidParenthesesTest {

    private ValidParentheses underTest;

    @BeforeEach
    void setup() {
        underTest = new ValidParentheses();
    }

    @Test
    void firstTest(){
        assertTrue(underTest.isValid("()"));
    }

    @Test
    void secondTest(){
        assertTrue(underTest.isValid("()[]{}"));
    }

    @Test
    void thirdTest(){
        assertFalse(underTest.isValid("(]"));
    }
}