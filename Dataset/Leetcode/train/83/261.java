class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode pre = head;
        ListNode cur = pre.next;
        while(cur!=null){
            if(pre.val==cur.val){
                cur = cur.next;
                if(cur==null){
                    pre.next = null;
                }
            }else{
                pre.next = cur;
                pre = cur;
                cur = pre.next;
            }
        }
        return head;
    }
}

