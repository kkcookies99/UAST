    public ListNode XXX(ListNode head, int n) {
       if(head == null)
           return null;
       ListNode dummyHead = new ListNode(0);
       dummyHead.next = head;
       ListNode fast = dummyHead,slow = dummyHead;
       
       while(n>=0){
           fast = fast.next;
           n--;
       }
       
       while(fast != null){
           slow = slow.next;
           fast = fast.next;
       }
       slow.next = slow.next.next;
       return dummyHead.next;
   }
}` ``
