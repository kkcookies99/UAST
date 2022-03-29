 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode dummy= head;
        ListNode move= head;
        int nodenum=0;
        while(dummy!=null)
        {
            nodenum++;
           dummy=dummy.next;
        }
        int i=0;
        while(i<nodenum-n-1)
        {
            move=move.next;
             i++;
        }
        move.next=move.next.next;
        return head;
    }
}

