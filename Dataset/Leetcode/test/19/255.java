 class Solution {
    public ListNode XXX(ListNode head, int n) {

        ListNode master = head, slave = head;

        for (int i = 0; i < n; i++) {
            if (master != null) master = master.next;
            //master==null
        }

        //n = 链表长度
        if (master == null) return head.next;

        while (master != null) {
            slave = slave.next;
            master = master.next;
        }

        //找到salve的附结点
        ListNode cur = head;
        while (cur.next != slave) cur = cur.next;
        cur.next = slave.next;

        return head;
    }
}

