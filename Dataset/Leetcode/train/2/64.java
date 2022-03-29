class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        return gao(l1, l2, 0);
    }

    public ListNode gao(ListNode l1, ListNode l2, int m) {
        if (l1 == null && l2 == null && m == 0) return null;
        int v1 = l1 != null ? l1.val : 0;
        int v2 = l2 != null ? l2.val : 0;
        return new ListNode((v1 + v2 + m) % 10,
                gao(l1 != null ? l1.next : null, l2 != null ? l2.next : null, (v1 + v2 + m) / 10));
    }
}

