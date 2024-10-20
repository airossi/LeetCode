package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class BuySellStockTest {

    private BuySellStock underTest;

    @BeforeEach
    void setup() {
        underTest = new BuySellStock();
    }

    @Test
    void firstTest() {
        assertEquals(5, underTest.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void secondTest() {
        assertEquals(0, underTest.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}