class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null||head.next ==null)return head;
          ListNode p =head;
        ListNode q = head.next;
        while(q!=null){
            if(p.val==q.val){
                q =q.next;
                p.next = null;
            }else{
               p.next =q;
               p=p.next;
               q=q.next;

            }
        }
        return head;
    }
}

