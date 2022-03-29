    public ListNode XXX(ListNode head) {
        if (head == null) return null;
        ListNode aux = head;
        ListNode res = head;
        while (head != null) {
            if (res.val != head.val) {
                res.next = head;
                res = head;
            }
            if (head.next == null) {
                res.next = null;
            }
            head = head.next;
        }
        return aux;
    }

