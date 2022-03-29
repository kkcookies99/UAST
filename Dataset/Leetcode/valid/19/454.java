 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode fast = head;
        ListNode slow = head;

        int k = 0;
        while (k!=n){
            k++;
            fast = fast.next;
        }

        while(fast != null){
            pre = pre.next;
            fast = fast.next;
            slow = slow.next;
        }

        pre.next = slow.next;


        return dummy.next;
    }
}

