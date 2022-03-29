class Solution {
    public ListNode XXX(ListNode head) {
        ListNode cur=head;
        ListNode tmp=cur;
        while(tmp!=null){
            while(tmp.next!=null&&tmp.val==tmp.next.val){
                tmp=tmp.next;
            }
            cur.next=tmp.next;
            cur=tmp.next;
            tmp=tmp.next;
        }
        return head;
    }
}

