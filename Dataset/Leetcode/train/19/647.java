 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode fast = head, slow = preHead;
        for(int i=0; i<n; i++) {
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return preHead.next;
    }
}

