class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode pred = dummyHead;
        int carry = 0;
        while(l1 != null || l2 != null) {
            ListNode sumNode = new ListNode();
            int sum = 0;
            if(l1 == null) {
                sum = l2.val + carry;
                l2 = l2.next;
            } else if(l2 == null) {
                sum = l1.val + carry;
                l1 = l1.next;
            } else {
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            sumNode.val = sum % 10;
            carry = sum / 10;
            pred.next = sumNode;
            pred = pred.next;
        }
        if(carry > 0) {
            pred.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}

