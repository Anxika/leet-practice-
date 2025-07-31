class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify logic
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;       // attach list1 node to tail
                list1 = list1.next;      // move list1 ahead
            } else {
                tail.next = list2;       // attach list2 node to tail
                list2 = list2.next;      // move list2 ahead
            }
            tail = tail.next; // Move the tail
        }

        // Attach the remaining list (if any)
        if (list1 != null) tail.next = list1;
        if (list2 != null) tail.next = list2;

        return dummy.next; // skip the dummy node
    }
}
