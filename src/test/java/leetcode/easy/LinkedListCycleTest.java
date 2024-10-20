package leetcode.easy;

import leetcode.models.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class LinkedListCycleTest {

    private LinkedListCycle underTest;

    @BeforeEach
    void setup() {
        underTest = new LinkedListCycle();
    }

    @Test
    void firstTest() {
        ListNode last = new ListNode(4);
        ListNode loopNode = new ListNode(2,
                new ListNode(0,
                        last));
        last.next = loopNode;
        ListNode firstList = new ListNode(
                3,
                loopNode
        );
        assertTrue(underTest.hasCycle(firstList));
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
        assertFalse(underTest.hasCycle(secondList));
    }

}