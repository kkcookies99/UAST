 public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode node = null;
        int sum = 0;
        while(l1 != null || l2 != null) {
            sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + sum / 10;
            if (node == null) {
                node = new ListNode(sum % 10);
                result.next = node;
            } else {
                node.next = new ListNode(sum % 10);
                node = node.next;
            }
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (sum > 9) {
            node.next = new ListNode(sum / 10);
        }
        return result.next;
    }

