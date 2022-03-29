class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null) return head;
        ListNode p = head;
        ListNode q; 
        while(p.next!=null){
            q=p.next; 
            if(p.val == q.val){
                p.next =q.next;
            }
            else   p=p.next;   
        }
        return head;
    }
}

