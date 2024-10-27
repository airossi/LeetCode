package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class IsomorphicStringTest {

    private IsomorphicString underTest;

    @BeforeEach
    void setup() {
        underTest = new IsomorphicString();
    }

    @Test
    void firstTest() {
        assertTrue(underTest.isIsomorphic("egg", "add"));
    }

    @Test
    void secondTest() {
        assertFalse(underTest.isIsomorphic("foo", "bar"));
    }

    @Test
    void thirdTest() {
        assertTrue(underTest.isIsomorphic("paper", "title"));
    }
}