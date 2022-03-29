 public ListNode XXX(ListNode head) {
        ListNode current = head;
        if (head == null) return null;
        ListNode index = head.next;
        while (index != null) {
            if (current.val == index.val) {
                index = index.next;
            } else {
                current.next = index;
                current = index;
                index = index.next;
            }
        }
        current.next = index;
        return head;
    }
code block

