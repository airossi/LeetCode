package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class LongestCommonPrefixTest {

    private LongestCommonPrefix underTest;

    @BeforeEach
    void setup() {
        underTest = new LongestCommonPrefix();
    }

    @Test
    void firstTest() {
        assertEquals("fl", underTest.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    void secondTest() {
        assertEquals("", underTest.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}