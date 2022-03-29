public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode curNode = null;
        ListNode result = null;
        boolean carry = false;
        while (l1 != null || l2 != null) {
            int a = 0;
            int b = 0;
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }
            int sum = (carry ? 1 : 0) + a + b;
            int value = sum % 10;
            carry = sum >= 10;
            if (result == null) {
                result = new ListNode(value);
                curNode = result;
            } else {
                curNode.next = new ListNode(value);
                curNode = curNode.next;
            }
        }
        if (carry) {
            curNode.next = new ListNode(1);
        }
        return result;
    }

