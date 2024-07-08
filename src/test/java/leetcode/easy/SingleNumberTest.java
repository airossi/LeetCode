package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class SingleNumberTest {

    private SingleNumber singleNumber;

    @BeforeEach
    void setup() {
        singleNumber = new SingleNumber();
    }

    @Test
    void firstTest(){
        assertEquals(1, singleNumber.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    void secondTest(){
        assertEquals(4, singleNumber.singleNumber(new int[]{4, 2, 1, 2, 1}));
    }

    @Test
    void thirdTest(){
        assertEquals(1, singleNumber.singleNumber(new int[]{1}));
    }
}