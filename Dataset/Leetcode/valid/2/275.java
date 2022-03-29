 /**
     * 2. 两数相加 Meidum
     *
     * @param l1
     * @param l2
     * @return 遍历两个l1, l2把carry-on处理好，每次生成一个新node，最后检查carry-on.
     */
    public ListNode XXX(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        int carried = 0;
        //哑节点
        ListNode resNode = new ListNode(-1);
        ListNode head = resNode;
        while (l1 != null || l2 != null) {
            //这个sum可以取到上个while循环结尾的进位值carried
            int sum = carried;
            //拿到l1 ,l2的值相加得sum
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            //拿到进位值carried
            carried = sum / 10;
            //sum取模
            sum %= 10;
            resNode.next = new ListNode(sum);
            resNode = resNode.next;
        }
        //判断最后一位是否还有个进位值
        if (carried != 0) {
            resNode.next = new ListNode(carried);
        }
        //返回头节点
        return head.next;
    }

