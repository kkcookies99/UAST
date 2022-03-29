class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        int carry = 0, a, b, sum;
        ListNode pre = new ListNode(0);
        ListNode temp = pre;
        while(l1 != null || l2 != null || carry !=0){
            a = l1 == null ? 0 : l1.val;
            b = l2 == null ? 0 : l2.val;
            sum = (a + b + carry) % 10;
            carry = (a + b + carry) / 10;
            temp.next = new ListNode(sum);
            temp = temp.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return pre.next;
    }
}

