 class Solution {
    public ListNode XXX(ListNode head, int n) {
        //快慢指针
        ListNode p = head, q = head, temp = null;
        for(int i = n; i > 0; i--)
            p = p.next;
        while(p != null){
            p = p.next;
            temp = q;
            q = q.next;
        }
        if(temp == null)
            return (n <= 1) ? null : head.next;

        temp.next = q.next;
        return head;
    }
}

