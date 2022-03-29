public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        int carry = 0;
        while (l1 != null || l2 != null) {
            carry /= 10;
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            dummy.next = new ListNode(carry % 10);
            dummy = dummy.next;
        }

        if (carry / 10 == 1)
            dummy.next = new ListNode(1);
        return ans.next;
    }

