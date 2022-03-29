  public ListNode XXX(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next=head;
        ListNode n1 = dummyHead;
        ListNode n2 = dummyHead;
        while (n-- != 0) {
            n2 = n2.next;
        }
        while (n2!=null&&n2.next!= null) {
            n1 = n1.next;
            n2 = n2.next;
        }
        n1.next = n1.next.next;
        return dummyHead.next;
    }

