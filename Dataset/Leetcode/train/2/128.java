class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        // 创建虚拟头结点dummy，然后将l1和l2同位置相加生成新节点接在dummy后面
        // 新节点只需要和的余数，除数留给下一个结点去相加
        ListNode dummy = new ListNode(0);
        ListNode p1 = dummy;
        int val = 0;
        while (l1 != null || l2 != null) {            
            if (l1 != null) {
                val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val += l2.val;
                l2 = l2.next;
            }
            p1.next = new ListNode(val % 10);// 小于10，val % 10还是val，大于等于10，取余数
            p1 = p1.next;
            val /= 10; // 将除数留给下一个结点
        }
        // 最后还要单独判断val > 0的情况
        if (val > 0) p1.next = new ListNode(val);
        return dummy.next;
    }
}

