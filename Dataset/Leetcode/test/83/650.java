 class Solution {
    public ListNode XXX(ListNode head) {
        ListNode last = head;
        ListNode next = null;
        if (last != null){
            next = last.next;
        }
        while (next != null){
            if (next.val == last.val){
                last.next = next.next;
            }else {
                last = next;
            }
            next = last.next;
        }
        return head;
    }
}

