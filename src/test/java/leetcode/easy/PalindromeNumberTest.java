package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    @BeforeEach
    void setup() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    void firstTest(){
        assertTrue( palindromeNumber.isPalindrome(121));
    }

    @Test
    void secondTest(){
        assertFalse(palindromeNumber.isPalindrome(-121));
    }

    @Test
    void thirdTest(){
        assertTrue(palindromeNumber.isPalindrome(1000000001));
    }
}