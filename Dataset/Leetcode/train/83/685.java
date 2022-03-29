 class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null){
            return head;
        }
        while(head.next != null && head.val == head.next.val){
            head.next = head.next.next;
        }
        head.next = XXX(head.next);
        return head;
    }
}

