 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head.next == null) return null;
        ListNode p0 = head;
        ListNode p1 = head;
        for(int i = 0; i <= n; i++){
            try{
                p1 = p1.next;
            } catch(NullPointerException e){
                head = head.next;
                return head;
            }
        }
        while(p1 != null){
            p1 = p1.next;
            p0 = p0.next;
        }
        p0.next = p0.next.next;
        return head;
    }
}

