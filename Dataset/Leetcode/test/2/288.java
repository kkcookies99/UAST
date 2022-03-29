public static ListNode XXX(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);//计算结果链表
        ListNode head = res;//链表头节点
        int pre = 0;//保存进位
        while (l1 != null || l2 != null) {
            //某一个为空时，设置为0
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            //对位相加 + 进位 = 当前位计算结果
            int sum = pre + x + y;
            pre = sum / 10;//进位
            //添加当前位的结果
            res.next = new ListNode(sum % 10);
            //计算结果进位
            res = res.next;
            //加数进位
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        //进位数还有则写入结果
        if (pre > 0) {
            res.next = new ListNode(pre);
        }
        //去掉头节点
        return head.next;
    }

