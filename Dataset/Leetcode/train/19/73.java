 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if( head == null || (head.next == null && n == 1)) return null;
        ListNode p = head;
        for(int i =0 ; i< n ; i++){
            p = p.next;
        }
        ListNode q = head;
        ListNode pre = q;
        while(p != null){
            p = p.next;
            pre = q;
            q = q.next;
        }
        if( q == head) return head.next;
        pre.next = q.next;
        return head;
    }
}

