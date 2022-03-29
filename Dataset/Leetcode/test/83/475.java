 public ListNode XXX(ListNode head) {
        ListNode cur = head;
        ListNode node;
        while (cur != null && (node = cur.next) != null) {
            if (cur.val == node.val) {
                cur.next = node.next;
                node.next = null;
            } else {
                cur = cur.next;
            }
        }
        return head;
 }

