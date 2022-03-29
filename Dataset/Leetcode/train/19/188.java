 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode pre = head;
        ListNode sec = head;
        while((n--)!=0){
            if(pre.next == null) return sec.next;
            pre = pre.next;
        }
        while(pre.next!=null){
            pre = pre.next;
            sec = sec.next;
        }
        ListNode temp=sec.next;
        sec.next = sec.next.next;
        temp.next = null;
        return head;
    }
}

