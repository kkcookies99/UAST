 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if (head == null) return head;
        ListNode dummy = new ListNode(0, head);

        getN(head, dummy, n);
        return dummy.next;
    }

    private int getN(ListNode curr, ListNode pre, int n) {
        if (curr == null) return 0;
        int _n = getN(curr.next, curr, n) + 1;
        if (_n == n) pre.next = curr.next;
        return _n;
    }
}

