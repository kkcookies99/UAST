public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        int val, c = 0; // 当前值val和进位值c
        while(null != l1 && null != l2){
            val = l1.val + l2.val +c;
            c = val / 10;
            val = val % 10;
            head.next = new ListNode(val);
            head = head.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(null != l1){
            val = l1.val + c;
            c = val / 10;
            val = val % 10;
            head.next = new ListNode(val);
            head = head.next;
            l1 = l1.next;
        }
        while(null != l2){
            val = l2.val + c;
            c = val / 10;
            val = val % 10;
            head.next = new ListNode(val);
            head = head.next;
            l2 = l2.next;
        }
        if(0 != c){
            head.next = new ListNode(c);
        }
        return temp.next;
    }

