   public ListNode XXX(ListNode head, int n) {
        if (n < 1 || head == null) {
            return head;
        }
        final int i = removeNodeToEnd(head, n);
        if (i == n) {
            head = head.next;
        }
        return head;
    }

    private int removeNodeToEnd(ListNode node, int n) {
        if (node == null) {
            return 0;
        }
        int index = removeNodeToEnd(node.next, n);
        if (index == n) {
            node.next = node.next.next;
        }
        return index + 1;
    }

