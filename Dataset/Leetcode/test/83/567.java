 class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null) return head;
        
        ListNode pre = head;
        int preVal = head.val;
        for(ListNode n = head.next;n != null;n = n.next){
            if(preVal == n.val) {
                pre.next = n.next;
            }else{
                preVal = n.val;
                pre = pre.next;
            }
        }
        
        return head;
    }
}

