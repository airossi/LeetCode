package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FindIndexFirstOccurrenceStringTest {

    private FindIndexFirstOccurrenceString underTest;

    @BeforeEach
    void setup() {
        underTest = new FindIndexFirstOccurrenceString();
    }

    @Test
    void firstTest(){
        assertEquals(0, underTest.strStr("sadbutsad", "sad"));
    }

    @Test
    void secondTest(){
        assertEquals(-1, underTest.strStr("leetcode", "leeto"));
    }
}