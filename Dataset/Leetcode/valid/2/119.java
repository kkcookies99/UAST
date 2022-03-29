class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;

        if (l2 == null)
            return l1;

        int v = l1.val + l2.val;
        if (v > 9) {
            l1.val = v - 10;
            l1.next = addOne(l1.next);
        } else {
            l1.val = v;
        }

        l1.next = XXX(l1.next, l2.next);
        return l1;
    }

    private ListNode addOne(ListNode node) {
        if (node == null)
            return new ListNode(1);

        if (node.val == 9) {
            node.val = 0;
            node.next = addOne(node.next);
        } else {
            ++node.val;
        }
        return node;
    }
}

