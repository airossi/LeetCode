package leetcode.easy;

public class RemoveDuplicatesSortedList {
    public static void main(String[] args) {
        ListNode firstList = new ListNode(
                1,
                new ListNode(
                        1,
                        new ListNode(2)
                )
        );

        ListNode firstExampleOutput = deleteDuplicates(firstList);
        System.out.println("First example list is now: ");
        while(firstExampleOutput != null) {
            System.out.println(firstExampleOutput.val);
            firstExampleOutput = firstExampleOutput.next;
        }

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

        ListNode secondExampleOutput = deleteDuplicates(secondList);
        System.out.println("Second example list is now: ");
        while(secondExampleOutput != null) {
            System.out.println(secondExampleOutput.val);
            secondExampleOutput = secondExampleOutput.next;
        }
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;

        ListNode startingHead = head;
        while(head.next != null) {
            if(head.val == head.next.val)
                head.next = head.next.next;
            else head = head.next;

        }
        return startingHead;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}