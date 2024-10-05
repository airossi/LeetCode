package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RemoveElementTest {

    private RemoveElement underTest;

    @BeforeEach
    void setup() {
        underTest = new RemoveElement();
    }

    @Test
    void firstTest(){
        assertEquals(2, underTest.removeElement(new int[]{3,2,2,3}, 3));
    }

    @Test
    void secondTest(){
        assertEquals(5, underTest.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}