 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode[] A = new ListNode[30];
        int a = 0;
        while (head != null) {
            A[a++] = head;
            head = head.next;
        }
        if (a == n) {
            return A[0].next;
        }
        A[a - n - 1].next = A[a - n].next;
        return A[0];
    }
}

