class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null) return null;
        ListNode mark = head;
        ListNode next = head.next;

        while (next != null) {

            while (next != null && next.val == head.val) {
                next = next.next;
            }

            head.next = next;
            head = head.next;
            if (next != null) next = next.next;

        }
        return mark;
    }
}

