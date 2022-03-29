class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode l = l1;
        while (l1.next != null && l2.next != null) {
            l1.val += l2.val;
            l1 = l1.next;
            l2 = l2.next;
        }
        l1.val += l2.val;
        if (l1.next == null && l2.next != null) {
            l1.next = l2.next;
        }
        l1 = l;
        while (l1 != null) {
            int carry = 0;
            int val = l1.val;
            if (val >= 10) {
                l1.val %= 10;
                carry += 1;
            }
            if (carry > 0) {
                if (l1.next != null) {
                    l1 = l1.next;
                    l1.val += carry;
                } else {
                    l1.next = new ListNode(carry);
                    l1 = l1.next;
                }
            } else {
                l1 = l1.next;
            }
        }
        return l;
    }
}

