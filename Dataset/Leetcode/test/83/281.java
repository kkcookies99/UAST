class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode cur = head.next, pre = head;
        int val = head.val;
        while(cur != null) {
            while(cur != null && cur.val == val) {
                cur = cur.next;
            }
            if(cur == null) {
                pre.next = null;
                break;
            }
            pre.next = cur;
            pre = cur;
            val = cur.val;
        }
        return head;
    }
}

