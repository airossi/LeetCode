package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class SingleNumberTest {

    private SingleNumber underTest;

    @BeforeEach
    void setup() {
        underTest = new SingleNumber();
    }

    @Test
    void firstTest(){
        assertEquals(1, underTest.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    void secondTest(){
        assertEquals(4, underTest.singleNumber(new int[]{4, 2, 1, 2, 1}));
    }

    @Test
    void thirdTest(){
        assertEquals(1, underTest.singleNumber(new int[]{1}));
    }
}