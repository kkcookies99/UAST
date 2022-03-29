 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0, head);
        ListNode fastPointer = dummyNode;
        ListNode slowPointer = dummyNode;
        int step = 0;

        while (fastPointer.next != null) {
            if (step < n) {
                fastPointer = fastPointer.next;
            }else {
                fastPointer = fastPointer.next;
                slowPointer = slowPointer.next;
            }
            step++;
        }

        slowPointer.next = slowPointer.next.next;
        return dummyNode.next;

    }
}

