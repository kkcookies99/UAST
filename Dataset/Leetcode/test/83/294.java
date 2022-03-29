class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode cur = head;
        while(cur != null){
            while(cur.next !=null && cur.val != cur.next.val){
                cur = cur.next;
            }
            while(cur.next !=null && cur.val == cur.next.val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }
}

