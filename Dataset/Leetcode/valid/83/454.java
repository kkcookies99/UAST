 class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null || head.next == null){return head;}
        
        if(head.val == head.next.val){
            return XXX(head.next);
        }else{
            head.next = XXX(head.next);
        }        
       return head;
    }
}

