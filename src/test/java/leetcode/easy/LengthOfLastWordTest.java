package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class LengthOfLastWordTest {

    private LengthOfLastWord lengthOfLastWord;

    @BeforeEach
    void setup() {
        lengthOfLastWord = new LengthOfLastWord();
    }

    @Test
    void firstTest(){
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
    }

    @Test
    void secondTest(){
        assertEquals(4, lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void thirdTest(){
        assertEquals(6, lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
    }
}