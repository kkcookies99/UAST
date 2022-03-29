class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(), p = dummy;
        // 维护进位数
        int ingress = 0;
        while(l1 != null || l2 != null) {
            int cur;
            if(l1 != null && l2 != null) {
                cur = l1.val + l2.val + ingress;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                cur = l1.val + ingress;
                l1 = l1.next;
            } else {
                cur = l2.val + ingress;
                l2 = l2.next;
            }
            ingress = cur >= 10 ? 1 : 0;
            p.next = new ListNode(cur % 10);
            p = p.next;
            
        }
        p.next = ingress == 1 ? new ListNode(1) : null;
        return dummy.next;
    }   
}

