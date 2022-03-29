 class Solution {
    public ListNode XXX(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        while(current !=null && current.next != null) {
            next = current.next;  
            if(current.val == next.val) {
                current.next = next.next;
            } else {
                current =  next;
            }
        }
        return head;
    }
}

