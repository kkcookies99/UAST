 class Solution {
    private int in;
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        int tmp;
        while (l1 != null && l2 != null) {
            tmp = l1.val + l2.val + in;
            f(p, tmp);
            l1 = l1.next;
            l2 = l2.next;
            p = p.next;
        }
        if (l1 != null) {
            simgleList(p, l1);
        }
        if (l2 != null) {
            simgleList(p, l2);
        }
        if (in == 1) p.next = new ListNode(1);
        return head.next;
    }
    public void simgleList(ListNode p, ListNode list) {
        int tmp;
        if (in != 1) p.next = list;
        else {
            while (list != null) {
                tmp = list.val + in;
                f(p, tmp);
                p = p.next;
                list = list.next;
            }
            if (in == 1) {
                p.next = new ListNode(1);
                in = 0;
            }
        }
    }
    public void f(ListNode p, int value) {
        if (value >= 10) {
            p.next = new ListNode(value%10);
            in = 1;
        } else {
            p.next = new ListNode(value);
            in = 0;
        }
    }
}

