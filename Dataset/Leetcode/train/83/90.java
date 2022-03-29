class Solution {
    public ListNode XXX(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        while(cur.next!=null&&cur.next.next != null){
            if(cur.next.val == cur.next.next.val){
                int duplicate = cur.next.val;
                while(cur.next.next!=null&&cur.next.next.val == duplicate){
                    cur.next = cur.next.next;
                }
            }else{
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}

