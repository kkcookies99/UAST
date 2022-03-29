 class Solution {
    public ListNode XXX(ListNode head) {
        ListNode guardNode = new ListNode(0);
        ListNode newLinkedList = guardNode;
        if(head != null) {
            newLinkedList.next = head;
            while (head.next != null) {
                if (head.val == head.next.val) {
                    head.next = head.next.next;
                    XXX(head);
                } else {
                    head = head.next;
                }
            }
        }

        return guardNode.next;
    }
}```

