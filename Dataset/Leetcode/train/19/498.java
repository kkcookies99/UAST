 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0, head);

        removeNode(dummyNode, dummyNode.next, n);

        return dummyNode.next;
    }

    private int removeNode(ListNode prev, ListNode node, int n) {
        if (node == null) {
            return 0;
        }

        int res = removeNode(node, node.next, n);
        res = res + 1;

        if (n == res) {
            prev.next = node.next;
        }
        
        return res;
    }
}

