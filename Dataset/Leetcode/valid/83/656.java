 class Solution {
    public ListNode XXX(ListNode head) {
        ListNode index = head;
        while (index != null && index.next != null) {
            if (index.val == index.next.val) {
                index.next = index.next.next;
            }else {
                index = index.next;
            }
        }
        return head;
    }
}

