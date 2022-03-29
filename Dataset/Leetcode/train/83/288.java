class Solution {
    public ListNode XXX(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode slow = dummy;

        while (head != null) {
            if (head.next == null) {
                slow.next = head;
                slow = head;
                head = head.next;
            } else {
                if (head.val != head.next.val) {
                    slow.next = head;
                    slow = head;
                    head = head.next;
                } else {
                    while (head.next != null && head.val == head.next.val) {
                        head = head.next;
                    }
                    slow.next = head;
                    slow = head;
                    head = head.next;
                }
            }
        }

        slow.next = null;
        return dummy.next;
    }
}

