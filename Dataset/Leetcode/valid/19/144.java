 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head.next == null)
            return null;
        ListNode p, left, right;
        p = head;
        for(int i = 0; i < n; i++){
            p = p.next;
            if(p == null)
                return head.next;
        }
        right = p;
        left = head;
        while(right.next != null){
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return head;
    }
}

