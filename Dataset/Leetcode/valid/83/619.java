 class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null) return null;
        ListNode p = head.next;
        ListNode h = head;
        int a = head.val;
        while(p != null){
            if(a == p.val){
                p = p.next;
                head.next = p; 
              }
            else if(a != p.val){
                head = head.next;
                a = p.val;
                p = p.next;
            }
           
        }
        return h;
         
    }
}

