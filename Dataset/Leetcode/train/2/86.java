class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        int val = l1.val + l2.val;
        return new ListNode(val % 10, XXX(l1.next, l2.next, val >= 10));
    }

    private ListNode XXX(ListNode l1, ListNode l2, boolean step) {
        if (l1 == null && l2 == null){
            if (step){
                return new ListNode(1, null);
            }
            return null;
        };
        int val = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + (step ? 1 : 0);
        return new ListNode(val % 10, XXX(l1 == null ? null : l1.next, l2 == null ? null : l2.next, val >= 10));
    }
}

