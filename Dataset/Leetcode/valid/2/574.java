     public ListNode XXX(ListNode l1, ListNode l2) {
        return XXX(l1, l2, false);
    }

    public ListNode XXX(ListNode l1, ListNode l2, boolean flag) {
        int num = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + (flag ? 1 : 0);
        boolean nextFlag = false;
        if (num > 9) {
            num -= 10;
            nextFlag = true;
        }
        ListNode listNode = new ListNode(num);
        if ((l1 != null && l1.next != null) || (l2 != null && l2.next != null)) {
            listNode.next = XXX(l1 == null ? null : l1.next, l2 == null ? null : l2.next, nextFlag);
        }
        if (nextFlag && listNode.next == null) {
            listNode.next = new ListNode(1);
        }
        return listNode;
    }

