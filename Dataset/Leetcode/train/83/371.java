 public ListNode XXX(ListNode head) {
        ListNode node = head;
        if(node != null){
            while (node.next != null){
                if(node.val == node.next.val){
                    node.next = node.next.next;
                    continue;
                }
                node = node.next;
            }
        }
        return head;
    }

