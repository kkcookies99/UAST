 public ListNode XXX(ListNode head) {
        //　会有空的情况
        if(head == null)
            return head;
        ListNode cur = head;
        //　输入是有序的，直接遍历比较即可
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }

