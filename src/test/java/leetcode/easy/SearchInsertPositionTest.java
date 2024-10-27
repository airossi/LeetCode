package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class SearchInsertPositionTest {

    private SearchInsertPosition underTest;

    @BeforeEach
    void setup() {
        underTest = new SearchInsertPosition();
    }

    @Test
    void firstTest() {
        assertEquals(2, underTest.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    void secondTest() {
        assertEquals(1, underTest.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    void thirdTest() {
        assertEquals(4, underTest.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}