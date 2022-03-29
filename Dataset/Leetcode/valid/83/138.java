class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null) return null;
        int preVal = head.val;
        ListNode p = head.next;
        ListNode q = head;
        while(p!=null){
            if(p.val!=preVal){
                q.next = p;
                q = q.next;
                preVal = p.val;
            }
            p = p.next;
        }
        q.next = null; // 将后续的抹去
        return head;
    }
}

