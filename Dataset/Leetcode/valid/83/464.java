     public ListNode XXX(ListNode head) {
        ListNode cur = head;
        ListNode temp;
        while (cur != null && cur.next != null) {
            temp = cur.next;
            while (temp != null && temp.val == cur.val) {
                cur.next = cur.next.next;
                temp.next = null;
                temp = cur.next;
            }
            cur = cur.next;
        }
        return head;
    }

