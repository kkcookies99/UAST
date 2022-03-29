 public ListNode XXX(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) {
        return null;
    }
    ListNode root = new ListNode();
    root.val = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
    if (root.val >= 10) {
        root.val %= 10;
        l1 = XXX(l1, new ListNode(0, new ListNode(1)));
    }
    root.next = XXX(l1 != null ? l1.next : null, l2 != null ? l2.next : null);
    return root;
}

