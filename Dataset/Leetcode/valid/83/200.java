class Solution {
    public ListNode XXX(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode prev = dummyNode;
        if(head == null) { return head;}
        while( head.next != null) {
            if(head.val != head.next.val) {
                prev.next = head;
                head = head.next;
                prev = prev.next;
            } else {              
                head = head.next;
            }
        }
        prev.next = head;

        return dummyNode.next;
    }
}

