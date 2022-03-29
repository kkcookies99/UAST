class Solution {
    public ListNode XXX(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode cur=dummy.next;
        while(cur.next!=null){
            if(cur.val==cur.next.val){
                cur.next=cur.next.next;
            }
            else{
                cur=cur.next;
            }
        }
        return dummy.next;
    }
}

