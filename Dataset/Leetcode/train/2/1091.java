 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(), curr = h;
        int p = 0;          
        while (l1 != null || l2 != null || p != 0) {
            int sum = p;
            sum += l1 == null ? 0 : l1.val;
            sum += l2 == null ? 0 : l2.val;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            p = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        return h.next;
    }
}

