 class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null) return null;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode tmp = dummyHead.next;
        while (tmp.next != null) {
            if (tmp.val != tmp.next.val) {
                tmp = tmp.next;
            } else {
                tmp.next = tmp.next.next;
            }
        }
        return dummyHead.next;
    }
}

