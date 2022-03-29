class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode  listNode= new ListNode(0);
        ListNode p = new ListNode(0);
        p = listNode;
        int sum = 0;
        while (l1 != null || l2 != null || sum != 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(sum % 10);
            sum = sum / 10;
            p = p.next;
        }
        return listNode.next;
    }
}

