 class Solution {
    public ListNode XXX(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fastNode = head;
 
        while (fastNode != null) {
            if (fastNode.next != null && fastNode.val == fastNode.next.val) {
                fastNode.next = fastNode.next.next;
            } else {
                fastNode = fastNode.next;
            }
        }

        return dummy.next;
    }
}

