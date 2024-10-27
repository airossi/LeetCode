package leetcode.easy;

import leetcode.models.ListNode;

public class MergeTwoSortedLists {

    public MergeTwoSortedLists() {
    }

    // Time Complexity: O(n + m) -- n size of the list1 and m size of the list2
    // Space Complexity: O(n + m)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            ListNode aux = list1.next;
            list1.next = mergeTwoLists(aux, list2);
            return list1;
        } else {
            ListNode aux = list2.next;
            list2.next = mergeTwoLists(list1, aux);
            return list2;
        }
    }
}