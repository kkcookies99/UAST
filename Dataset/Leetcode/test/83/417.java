 class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode prev = head, cur = head.next;
        while (cur != null) {
            if(prev.val == cur.val){
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev = prev.next;
                cur = cur.next;
            }
        }
        return head;
    }
}

