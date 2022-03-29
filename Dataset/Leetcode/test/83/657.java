 class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null)
            return head;
        ListNode p = head;
        while(p.next != null) {
            if(p.next.val == p.val)
                p.next = p.next.next;
            else
                p = p.next;
        }
        return head;
    }
}

