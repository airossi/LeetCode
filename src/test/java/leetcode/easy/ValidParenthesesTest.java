package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    @BeforeEach
    void setup() {
        validParentheses = new ValidParentheses();
    }

    @Test
    void firstTest(){
        assertTrue(validParentheses.isValid("()"));
    }

    @Test
    void secondTest(){
        assertTrue(validParentheses.isValid("()[]{}"));
    }

    @Test
    void thirdTest(){
        assertFalse(validParentheses.isValid("(]"));
    }
}