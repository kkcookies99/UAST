public ListNode XXX(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode lastNode = head;
        ListNode indexNode = head;
        while (indexNode != null) {
            if (lastNode.val != indexNode.val) {
                lastNode.next = indexNode;
                lastNode = indexNode;
            }
            indexNode = indexNode.next;
            if (indexNode == null) {
                lastNode.next = null;
            }
        }
        return head;
    }

