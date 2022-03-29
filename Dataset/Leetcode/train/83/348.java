class Solution {
    public ListNode XXX(ListNode head) {
        ListNode cur = head;
        while(cur!=null){
            if(cur.next!=null&&cur.next.val==cur.val) 
                cur.next = cur.next.next;
            else 
                cur = cur.next;
        }
        return head;
    }
}

