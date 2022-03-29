 class Solution {

    public ListNode XXX(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        emm(temp, n);
        return temp.next;
    }
    private static int emm(ListNode listNode, int n) {
        if (listNode.next == null) return 0;
        int i = emm(listNode.next, n) + 1;
        if (i == n) listNode.next = listNode.next.next;
        return i;
    }
}
