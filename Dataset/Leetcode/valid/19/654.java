 public ListNode XXX(ListNode head, int n) {
        if(head == null || n < 0){
            return head;
        }

        
        // 寻找倒数第n+1个节点
        ListNode slow = head;
        ListNode fast = head;

        int i = 0;
        for(; fast != null && i < n + 1; i++){
            fast = fast.next;
        }

        // 删除头节点
        if(fast == null && i != n + 1){
            return head.next;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next =slow.next.next;
        return head;
    }


