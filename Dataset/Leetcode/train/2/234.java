class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
//         创建要返回的链表和指向它的指针p
        ListNode ans = new ListNode(0);
        ListNode p = ans;
//         temp用于保存当前累加的值
        int temp = 0;
        while (l1 != null || l2 != null) {
//             temp大于10则变为1，否则为0
            temp /= 10;
//             如果链表非空，则将当前节点的值累加进temp
            if (l1 != null) {
                temp += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                temp += l2.val;
                l2 = l2.next;
            }
//             创建下一个节点并指向它
            p.next = new ListNode(temp % 10);
            p = p.next;
        }
//         如果最后的累加值不小于10，则还需要进位
        if (temp > 9) {
            p.next = new ListNode(1);
        }
//         返回头结点指向的链表
        return ans.next;
    }
}

