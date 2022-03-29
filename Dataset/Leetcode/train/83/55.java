class Solution {
 public ListNode XXX(ListNode head) {
        ListNode fast, slow = fast = head;

        while (fast != null){
            if (fast.val != slow.val){
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
            slow.next = null;
        }
        return head;
    }
}

