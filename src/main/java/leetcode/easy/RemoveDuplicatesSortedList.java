package leetcode.easy;

import leetcode.models.ListNode;

public class RemoveDuplicatesSortedList {

    public RemoveDuplicatesSortedList() {
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode startingHead = head;
        while (head.next != null) {
            if (head.val == head.next.val)
                head.next = head.next.next;
            else head = head.next;
        }
        return startingHead;
    }
}