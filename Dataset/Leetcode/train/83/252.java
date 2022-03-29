public ListNode XXX(ListNode head) {
            if(head == null)return head;
            ListNode header = new ListNode(-1);
            header.next = head;
            ListNode cur = head;
            while(cur.next != null){
                ListNode temp = cur.next;
                if(cur.val == temp.val)
                    cur.next = cur.next.next;
                else
                    cur = cur.next;
            }
            return header.next;
    }

