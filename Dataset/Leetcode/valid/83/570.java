  public ListNode XXX(ListNode head) {
        ListNode temp = head;
        ListNode now = head;
        while (temp != null && temp.next != null) {
            now = temp.next;
            while (now!=null&&now.val == temp.val) {
                now = now.next;
            }
            temp.next = now;
            temp=now;
        }
        return head;
    }

