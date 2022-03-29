 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head == null){
            return head;
        }else if(n == 1 && head.next == null){
            return null;
        }
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode end = newHead;
        ListNode start = end;
        int i = 0;
        for( ; i < n; i++){
            start = start.next;
        }
        while(start.next != null){
            start = start.next;
            end = end.next;
        }
        ListNode p = new ListNode();
        p = end.next.next;
        end.next = p;
        return newHead.next;
    }
}

