  public ListNode XXX(ListNode l1, ListNode l2) {
        int sum;
        int carry = 0;
        int l1value;
        int l2value;
        ListNode point = new ListNode(0);
        ListNode dummyhead = point;
        while (l1!= null || l2 != null || carry==1) {
            l1value = l1 == null ? 0 : l1.val;
            l2value = l2 == null ? 0 : l2.val;
            sum = l1value + carry + l2value;
            if (sum >= 10) {
                sum -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            point.next = new ListNode(sum);
            point = point.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummyhead.next;
    }

