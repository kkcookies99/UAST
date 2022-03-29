     public ListNode XXX(ListNode head) {

        //一个节点或者没有节点
        if (head == null || head.next == null) {
            return head;
        }

        //至少两个节点的情况
        ListNode curr = head;
        while (curr.next != null) {
            if (curr.next.val == curr.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }


