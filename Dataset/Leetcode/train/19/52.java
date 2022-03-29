 class Solution {
    public ListNode XXX(ListNode head, int n) {

      ListNode slow = head;
      ListNode fast = head;
      ListNode  temp = new ListNode(-1);
      temp.next = head;
      ListNode pre = temp;
      int i = 1;
      while(fast.next != null){
          if(i < n){ 
              i ++;
          } else {
            pre = pre.next;  
            slow = slow.next;
          }
         fast  = fast.next;
      }
       pre.next = slow.next;
      return temp.next;
    }
}

