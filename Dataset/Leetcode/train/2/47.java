class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(), tail = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            carry = sum / 10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
    }
}

