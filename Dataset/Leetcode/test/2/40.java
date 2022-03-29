   public ListNode XXX(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        int c = 0;
        ListNode s1 = l1;
        ListNode s2= l2;
        while (l1 != null && l2 != null) {
            int a = l1.val;
            int b = l2.val;
            c = l1.val + l2.val + c;
            l1.val = c % 10;
            c = c / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null && c != 0) {
            c = l1.val + c;
            l1.val = c % 10;
            c = c / 10;
            if (l1.next == null && c != 0) {
                ListNode l = new ListNode(1);
                l1.next = l;
                c=0;
                break;
            }
            l1 = l1.next;
        }
        if (l2 != null) {
            ListNode r1=s1;
            while (r1.next != null) r1 = r1.next;
            r1.next = l2;
            while (l2 != null && c != 0) {
                c = l2.val + c;
                l2.val = c % 10;
                c = c / 10;
                if (l2.next == null && c != 0) {
                    ListNode l = new ListNode(1);
                    c=0;
                    l2.next = l;
                    break;
                }
                l2 = l2.next;
            }
        }
        if(c!=0){
            ListNode r1=s1;
            while (r1.next != null) r1 = r1.next;
            r1.next=new ListNode(1);
        }
        return s1;
    }

