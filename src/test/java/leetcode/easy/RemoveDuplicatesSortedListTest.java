package leetcode.easy;

import leetcode.models.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class RemoveDuplicatesSortedListTest {

    private RemoveDuplicatesSortedList underTest;

    @BeforeEach
    void setup() {
        underTest = new RemoveDuplicatesSortedList();
    }

    @Test
    void firstTest() {
        ListNode firstList = new ListNode(
                1,
                new ListNode(
                        1,
                        new ListNode(2)
                )
        );
        ListNode response = underTest.deleteDuplicates(firstList);
        int size = 0;
        while (response != null) {
            size++;
            response = response.next;
        }
        assertEquals(2, size);
    }

    @Test
    void secondTest() {
        ListNode secondList = new ListNode(
                1,
                new ListNode(
                        1,
                        new ListNode(
                                2,
                                new ListNode(
                                        3,
                                        new ListNode(3)
                                )
                        )
                )
        );
        ListNode response = underTest.deleteDuplicates(secondList);
        int size = 0;
        while (response != null) {
            size++;
            response = response.next;
        }
        assertEquals(3, size);
    }
}