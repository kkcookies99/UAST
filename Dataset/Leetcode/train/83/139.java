public ListNode XXX(ListNode head) {
        ListNode current = head;
        while (current !=null){
            ListNode after = current.next;
            if(after!=null && current.val==after.val) {
                current.next=after.next;
            } else {
                current=after;
            }
        }
        return head;
    }

