 class Solution {
    public ListNode XXX(ListNode head, int n) {
        // Boundary conditions
        // empty list
        if(head == null){return head;}
        // two procedure
        // traverse the list, get length
        ListNode cur = head;
        int L = 0; // length
        while(cur != null){
            cur = cur.next;
            L += 1;
        }
        // L = n
        if(L == n){return head.next;}
        // delete reverse n
        ListNode newCur = head;
        int m = 0;
        while(m < L - n - 1){
            newCur = newCur.next;
            m += 1;
        }
        newCur.next = newCur.next.next;
        return head;
    }
}

