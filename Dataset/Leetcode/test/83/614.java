 public ListNode XXX(ListNode head) {
            if(head == null || head.next == null) return head;
            ListNode last = head;
            ListNode cur = head.next;
            while(cur.next != null){
                if(cur.val != last.val){
                    last.next = cur;
                    last = last.next;
                } 
                 cur = cur.next;
            }
            last.next = last.val == cur.val ? null : cur;
            return head;
        }
code block

