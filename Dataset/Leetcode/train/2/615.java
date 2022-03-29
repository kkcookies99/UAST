 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        return XXX(l1, l2, 0);
    }

    private ListNode XXX(ListNode l1, ListNode l2, int i) {
        if (l1 == null && l2 == null) {
            if (i == 1) {
                return new ListNode(1);
            }
            return null;
        } else if (l1 == null) {
            i += l2.val;
            l2.val = i % 10;
            l2.next = XXX(null, l2.next, i / 10);
            return l2;
        } else if (l2 == null) {
            i += l1.val;
            l1.val = i % 10;
            l1.next = XXX(l1.next, null, i / 10);
            return l1;
        } else {
            i += l1.val + l2.val;
            l1.val = i % 10;
            l1.next = XXX(l1.next, l2.next, i / 10);
            return l1;
        }
    }
}

