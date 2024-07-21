package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class PlusOneTest {

    private PlusOne underTest;

    @BeforeEach
    void setup() {
        underTest = new PlusOne();
    }

    @Test
    void firstTest(){
        assertArrayEquals(new int[]{1,2,4}, underTest.plusOne(new int[]{1,2,3}));
    }

    @Test
    void secondTest(){
        assertArrayEquals(new int[]{4,3,2,2}, underTest.plusOne(new int[]{4,3,2,1}));
    }

    @Test
    void thirdTest(){
        assertArrayEquals(new int[]{1,0}, underTest.plusOne(new int[]{9}));
    }
}