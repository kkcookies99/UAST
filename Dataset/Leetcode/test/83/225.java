class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null) return head;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null){
            if (fast.val != slow.val){
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        slow.next = null;
        return head;
    }
}

