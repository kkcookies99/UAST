class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode cur = head.next;
        ListNode tail = head;
        while(cur != null){
            if(tail.val == cur.val){
                tail.next = cur.next;
                cur = cur.next;
            }else{
                cur = cur.next;
                tail = tail.next;
            }
        }
        return pre.next;
    }
}

