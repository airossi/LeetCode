package leetcode.easy;

import leetcode.models.ListNode;

public class LinkedListCycle {

    public LinkedListCycle() {
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}