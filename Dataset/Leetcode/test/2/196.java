class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        if (l1 == null || l2== null) {
            if (l1 != null) {
                return l1;
            }
            if (l2 != null) {
                return l2;
            }
            return null;
        }
        else {
            int sum = l1.val + l2.val;
            int carryBit = sum / 10;
            ListNode result = new ListNode(sum % 10);
            ListNode  listNode = result;
            while (l1.next != null || l2.next != null) {
                // 高位补零
                if (l1.next == null) {
                    l1.next = new ListNode(0);
                }
                if (l2.next == null) {
                    l2.next = new ListNode(0);
                }

                l1 = l1.next;
                l2 = l2.next;

                sum = l1.val + l2.val + carryBit;
                listNode.next = new ListNode(sum % 10);
                carryBit = sum / 10;

                listNode = listNode.next;
            }
            if ( carryBit==1 ) {
                listNode.next = new ListNode(carryBit);
            }
            return result;
        }
    }
}

