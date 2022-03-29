 class Solution {
    public ListNode XXX(ListNode head) {
       if (head == null) {
            return null;
        }
        ListNode ret = XXX(head.next);
        if(ret!=null){
            if (head.val == ret.val) {
                head.next = ret.next;
            }
        }
        return head; 
    }
}

