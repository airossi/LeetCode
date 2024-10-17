package leetcode.easy;

import leetcode.models.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MergeTwoSortedListsTest {

    private MergeTwoSortedLists underTest;

    @BeforeEach
    void setup() {
        underTest = new MergeTwoSortedLists();
    }

    @Test
    void firstTest(){
        ListNode firstList = new ListNode(
                1,
                new ListNode(
                        2,
                        new ListNode(4)
                )
        );
        ListNode secondList = new ListNode(
                1,
                new ListNode(
                        3,
                        new ListNode(4)
                )
        );
        ListNode response = underTest.mergeTwoLists(firstList, secondList);
        int size = 0;
        while (response != null) {
            size++;
            response = response.next;
        }
        assertEquals(6, size);
    }

    @Test
    void secondTest(){
        ListNode response = underTest.mergeTwoLists(null, null);
        assertNull(response);
    }
}