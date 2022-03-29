 class Solution {
    public ListNode XXX(ListNode head) {
      ListNode current = head;
      while(current != null){
          ListNode next = current.next;
          if(next != null && current.val == next.val){
              current.next = next.next;
          }else{
              current = next;
          }
      }
      return head;  
    }
}

