public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;//记录进位的值
        while (l1 != null || l2 != null) {
            //两个链表可能长度不一致 较短的链表补0  比如 33 + 1 = 33 + 01
            int x1 = l1 == null ? 0 : l1.val;
            int x2 = l2 == null ? 0 : l2.val;
            int sum = x1 + x2 + carry;

            carry = sum / 10; //更新进位值
            sum = sum % 10;//取余  是当前这一位要保留的结果

            cur.next = new ListNode(sum);

            cur = cur.next;
            if (l1.next != null) {
                l1 = l1.next;
            }
            if (l2.next != null) {
                l2 = l2.next;
            }
        }
        //检查最后一位 相加 是否还需要再进位
        if (carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }


