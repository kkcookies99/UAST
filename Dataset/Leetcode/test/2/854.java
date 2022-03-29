 public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode t1 = l1, t2 = l2;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        while (t1 != null) {
            s1.append(t1.val);
            t1 = t1.next;
        }
        while (t2 != null) {
            s2.append(t2.val);
            t2 = t2.next;
        }
        BigDecimal decimal = new BigDecimal(s1.reverse().toString()).add(new BigDecimal(s2.reverse().toString()));
        StringBuilder reverse = new StringBuilder(decimal.toString()).reverse();
        ListNode temp = new ListNode(0),cur = temp;
        for (int i = 0; i < reverse.length(); i++) {
            cur.next = new ListNode(Integer.parseInt(String.valueOf(reverse.charAt(i))));
            cur = cur.next;
        }
        return temp.next;
    }

