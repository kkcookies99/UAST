 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode sential = new ListNode(0);
        sential.next = head;
        ListNode pre = sential, cur = pre;
        while(n != 0){
            cur = cur.next;
            n--;
        }
        while(cur.next != null){
            cur = cur.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return sential.next;
    }
}

