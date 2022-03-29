class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode res = new ListNode(0, null);
        ListNode p = res;
        while (l1 != null && l2 != null) {
            int num = l1.val + l2.val + c;
            c = 0;
            if (num > 9) {
                num = num - 10;
                c = 1;
            }
            ListNode a = new ListNode (num, null);
            p.next = a;
            p = p.next; 
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null){
            int num = l1 .val + c;
            if (num > 9) {
                num -= 10;
                c=1;
            } else {
                c = 0;
            }
            ListNode a = new ListNode (num, null);
            p.next = a;
            p = p.next;
            l1 = l1.next;
        }
        while (l2 != null){
            int num = l2.val + c;
            if (num > 9) {
                num -= 10;
                c=1;
            } else {
                c = 0;
            }
            ListNode a = new ListNode (num, null);
            p.next = a;
            p = p.next;
            l2 = l2.next;
        }
        if (c == 1) {
            ListNode a = new ListNode (1 , null);
            p.next = a;
        }
        return res.next;
    }
}

