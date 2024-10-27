package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class AddStringsTest {

    private AddStrings underTest;

    @BeforeEach
    void setup() {
        underTest = new AddStrings();
    }

    @Test
    void firstTest() {
        assertEquals("134", underTest.addStrings("11", "123"));
    }

    @Test
    void secondTest() {
        assertEquals("533", underTest.addStrings("456", "77"));
    }

    @Test
    void thirdTest() {
        assertEquals("0", underTest.addStrings("0", "0"));
    }

}