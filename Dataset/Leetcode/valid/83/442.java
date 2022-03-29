 class Solution {
    public ListNode XXX(ListNode head) {
        ListNode first = head;
        while(head != null && head.next != null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        return first;
    }
}

