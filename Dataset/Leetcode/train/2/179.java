public ListNode XXX(ListNode l1, ListNode l2) {
    ListNode root = null;
    ListNode node = null;
    boolean increase = false;
    while(l1 != null || l2 != null || increase) {
        int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + (increase ? 1 : 0);
        int mod = sum % 10;
        if (node == null) {
            node = new ListNode(mod);
            root = node;
        } else {
            node.next = new ListNode(mod);
            node = node.next;
        }
        increase = sum != mod;
        l1 = l1 != null ? l1.next : null;
        l2 = l2 != null ? l2.next : null;
    }
    return root;
}

