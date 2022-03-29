 class Solution {
    public ListNode XXX(ListNode head) {
           if(head == null){
               return null;
           }
           ListNode first = head;
           while(head.next != null){
               if(head.val != head.next.val){
                   head = head.next;
               }else{
                   head.next = head.next.next;
               }
           }
           return first;
    }
}

