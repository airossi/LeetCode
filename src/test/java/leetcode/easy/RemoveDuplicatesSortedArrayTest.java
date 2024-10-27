package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class RemoveDuplicatesSortedArrayTest {

    private RemoveDuplicatesSortedArray underTest;

    @BeforeEach
    void setup() {
        underTest = new RemoveDuplicatesSortedArray();
    }

    @Test
    void firstTest() {
        assertEquals(2, underTest.removeDuplicates(new int[]{1, 1, 2}));
    }

    @Test
    void secondTest() {
        assertEquals(5, underTest.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}