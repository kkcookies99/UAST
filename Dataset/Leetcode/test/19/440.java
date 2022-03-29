 class Solution {
    public ListNode XXX(ListNode head, int n) {
       ListNode ans = new ListNode(0,head);
       ListNode slow = ans,fast  = head;
       int up =0;
       while(fast!=null){
           fast = fast.next;
           if(up>=n){
               slow = slow.next;
           }
           up++;
       }
       slow.next = slow.next.next;
       return ans.next;
    }
}

