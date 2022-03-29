class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode l = new ListNode();
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode t = l;
        int n = 0;
        while (t1 != null || t2 != null || n != 0) {
            if (t1 != null) {
                n += t1.val;
                t1 = t1.next;
            }
            if (t2 != null) {
                n += t2.val;
                t2 = t2.next;
            }
            t.next = new ListNode(n % 10);
            t = t.next;
            n = n / 10;
        }
        return l.next;
    }
}```

