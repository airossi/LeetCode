package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PalindromeNumberTest {

    private PalindromeNumber underTest;

    @BeforeEach
    void setup() {
        underTest = new PalindromeNumber();
    }

    @Test
    void firstTest(){
        assertTrue( underTest.isPalindrome(121));
    }

    @Test
    void secondTest(){
        assertFalse(underTest.isPalindrome(-121));
    }

    @Test
    void thirdTest(){
        assertTrue(underTest.isPalindrome(1000000001));
    }
}