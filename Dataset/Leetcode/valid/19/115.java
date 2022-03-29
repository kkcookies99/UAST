 public ListNode XXX(ListNode head, int n) {
        if(head.next == null) return null;
        ListNode dumy = head;
        ListNode fast = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        // 删除的是头节点
        if(fast == null) return head.next;
        while(fast.next != null){
            fast = fast.next;
            head = head.next;
        }
        head.next = head.next.next;
        return dumy;
    }

