package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    void setup() {
        twoSum = new TwoSum();
    }

    @Test
    void firstTest(){
        int[] output = twoSum.getTwoSumIndexes(new int[]{2, 7, 11, 15}, 9);

        assertEquals(0, output[0]);
        assertEquals(1, output[1]);
    }

    @Test
    void secondTest(){
        int[] output = twoSum.getTwoSumIndexes(new int[]{3, 2, 4}, 6);

        assertEquals(1, output[0]);
        assertEquals(2, output[1]);
    }

    @Test
    void thirdTest(){
        int[] output = twoSum.getTwoSumIndexes(new int[]{3, 3}, 6);

        assertEquals(1, output[0]);
        assertEquals(0, output[1]);
    }
}