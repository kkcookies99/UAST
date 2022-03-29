public ListNode XXX(ListNode head) {
        if(null == head || head.next == null) return head;

        ListNode curr = head;

        while (curr.next!=null){
            if (curr.val == curr.next.val){
                curr.next = curr.next.next;
            } else curr = curr.next;
        }
        return head;
    }

