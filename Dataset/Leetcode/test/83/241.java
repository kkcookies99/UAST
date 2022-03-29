class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast!=null){
            if(slow.val!=fast.val){
                slow.next = fast;
                slow =fast;                
            }
            fast = fast.next;  
        }
        //最后的slow要断开，要不[8,9,9]会变成[8,9,9]
        slow.next = null;
        return head;
    }
}

