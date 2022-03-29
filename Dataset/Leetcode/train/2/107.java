class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while(l1 != null || l2 != null) {
            if(l1 != null && l2 != null) {
                int temp = l1.val + l2.val + carry;
                cur.next = new ListNode(temp % 10);
                cur = cur.next;
                carry = temp / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l2 != null) {
                int temp = l2.val + carry;
                cur.next = new ListNode(temp % 10);
                cur = cur.next;
                carry = temp / 10;
                l2 = l2.next;
            }
            else if(l1 != null) {
                int temp = l1.val + carry;
                cur.next = new ListNode(temp % 10);
                cur = cur.next;
                carry = temp / 10;
                l1 = l1.next;
            }
        }
        if(carry > 0) {
            cur.next = new ListNode(carry);
        }
        return res.next;
    }
}

