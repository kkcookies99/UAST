 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head == null)
            return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode first = head;
        ListNode second = dummy;
        while(first != null) {
            if(n == 0) 
                second = second.next;
            else
                n--;
            first = first.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}

