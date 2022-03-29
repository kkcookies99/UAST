  public ListNode XXX(ListNode head, int n) {
        if (head.next == null && n == 1) return null;
        ListNode tempHead = new ListNode();
        tempHead.next = head;
        ListNode former = tempHead, latter = tempHead;
        for (int i = 0; i < n + 1; i++)
            former = former.next;
        while (former != null) {
            former = former.next;
            latter = latter.next;
        }
        latter.next = latter.next.next;
        return tempHead.next;
    }


