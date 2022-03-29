 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        //定义结果链表
        ListNode head = null;
        ListNode tail = null;
        int carry = 0; //进位
        //当前位置两数相加，相加结果放在结果链表中，如果有进位就将放在下一个节点
        while (l1 != null || l2 != null) {
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;
            int sum = num1 + num2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            //向链表后获取
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        //判断计算结束后是否还有进位
        if (carry != 0) tail.next = new ListNode(carry);
        return head;
    }
}

