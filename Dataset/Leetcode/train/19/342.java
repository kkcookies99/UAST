 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode nthendfront = head, p = head;
        int i = 0;
        while (p.next != null) {
            p = p.next;
            if (i >= n) {
                nthendfront = nthendfront.next;
            }
            ++i;
        }
        // 通过 i 和 n 比较 确定要删除的是不是头结点
        if (i >= n) {
            nthendfront.next = nthendfront.next.next;
        } else {
            head = head.next;
        }
        return head;
    }
}