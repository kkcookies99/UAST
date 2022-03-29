 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode[] A = new ListNode[100];
        ListNode p1 = head;
        int i=0;
        while(p1!=null){
            A[i++] = p1;
            p1 = p1.next;
        }
        if(n==i) return A[1];
        A[i-n-1].next = A[i-n].next;
        return A[0];
    }
}

