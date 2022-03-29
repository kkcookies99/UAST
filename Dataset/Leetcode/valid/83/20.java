class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode pre = head, next = head.next;
        while(next != null){
            if(next.val == pre.val){
                pre.next = next.next;
                next = next.next;
            }else{
                pre = next;
                next = next.next;
            }
        }
        return head;
    }
}

