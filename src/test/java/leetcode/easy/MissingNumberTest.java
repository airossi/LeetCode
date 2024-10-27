package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class MissingNumberTest {

    private MissingNumber underTest;

    @BeforeEach
    void setup() {
        underTest = new MissingNumber();
    }

    @Test
    void firstTest() {
        assertEquals(2, underTest.missingNumber(new int[]{3, 0, 1}));
    }

    @Test
    void secondTest() {
        assertEquals(2, underTest.missingNumber(new int[]{0, 1}));
    }

    @Test
    void thirdTest() {
        assertEquals(8, underTest.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}