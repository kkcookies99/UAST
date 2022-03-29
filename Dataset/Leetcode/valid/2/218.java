class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        int n1;
        int n2;
        int sum;
        boolean carry = false;
        while (null != l1 || null != l2) {
            n1 = null != l1 ? l1.val : 0;
            n2 = null != l2 ? l2.val : 0;
            sum = (n1 + n2) + (carry ? 1 : 0);
            carry = false;
            if (sum > 9) {
                sum = sum - 10;
                carry = true;
            }
            current.next = new ListNode(sum);
            current = current.next;
            l1 = null == l1 ? null : l1.next;
            l2 = null == l2 ? null : l2.next;
        }
        if (carry){
            current.next = new ListNode(1);
        }
        return result.next;
    }
}

