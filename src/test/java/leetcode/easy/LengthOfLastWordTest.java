package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class LengthOfLastWordTest {

    private LengthOfLastWord underTest;

    @BeforeEach
    void setup() {
        underTest = new LengthOfLastWord();
    }

    @Test
    void firstTest(){
        assertEquals(5, underTest.lengthOfLastWord("Hello World"));
    }

    @Test
    void secondTest(){
        assertEquals(4, underTest.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void thirdTest(){
        assertEquals(6, underTest.lengthOfLastWord("luffy is still joyboy"));
    }
}