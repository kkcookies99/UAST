    public ListNode XXX(ListNode head, int n) {
        //虚拟头结点
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode p1 = dummyHead, p2 = dummyHead;
        int step = 0;
        while (p1 != null) {
            if (step > n) {
                p2 = p2.next;
            }
            p1 = p1.next;
            ++step;

            //此时p2已经指向倒数第n个节点,直接删除满足条件节点即可
            if (p1 == null) {
                p2.next = p2.next.next;
            }
        }
        return dummyHead.next;
    }

