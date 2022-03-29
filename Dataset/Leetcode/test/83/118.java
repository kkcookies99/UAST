public ListNode XXX(ListNode head) {
        ListNode n = head;
        //head 的当前 val
        //int val = head.val;
        while (head.next != null) {
            ListNode next = head.next;
            //int nextVal = head.next.val;
            if (head.val == head.next.val) {
                head.next = next.next;
                next.next = null;
            } else {
                head = head.next;
                //val = head.val;
            }
        }
        return n;
    }

