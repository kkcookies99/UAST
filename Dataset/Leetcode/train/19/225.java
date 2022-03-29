 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode temp = head;
        int len = 1;
        // 计算链表长度
        while (temp.next != null) {
            len += 1;
            temp = temp.next;
        }
        
        // 删除倒数第n个节点，就是删除下标为index的数据，如果index是0，证明是第一个数据，直接指向下一个就行
        int index = len - n;
        if (index == 0) {
            head = head.next;
            return head;
        }
        
        // 开始删除
        temp = head;
        if (temp.next == null) {
            return null;
        }
        while (temp.next != null) {
            // 当index走到是0，则将当前节点的下一个节点指向下下一个节点
            if (--index == 0) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}

