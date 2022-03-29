 class Solution {
    int num = 0;
    public ListNode XXX(ListNode head, int n) {
        if(head == null) {
            return null;
        }
        head.next = XXX(head.next,n);
        num++;
        return num == n ? head.next : head;
    }
}

