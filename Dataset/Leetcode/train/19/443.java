 class Solution {
    public ListNode XXX(ListNode head, int n) {

        if (head == null)
        {
            return head;
        }

        // ListNode dummy = new ListNode(0, head);

        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < n; i++)
        {
            fast = fast.next;
        }

        if (fast == null)
        {
            head = head.next;

            return head;
        }

        while (fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}

