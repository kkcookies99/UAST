class Solution {
    public ListNode XXX(ListNode head) {
        ListNode cur = head;
        while(cur!=null && cur.next!=null){
            ListNode next = cur.next;
            if(cur.val==next.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }
}

