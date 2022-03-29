 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode cur = head;
        // 求链表长度
        int len = 0;
        while (cur != null){
            cur = cur.next;
            len++;
        }
        cur = head;
        // 如果删除的是头结点 直接返回头结点.next
        if (len - n == 0){
            return head.next;
        }
        ListNode pre = null;
        // 不然的话遍历到目标节点给他删了
        while (len - n > 0){
            pre = cur;
            cur = cur.next;
            len--;
        }
        pre.next = cur.next;

        return head;
    }
}

