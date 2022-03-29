 class Solution {
    public ListNode XXX(ListNode head, int n) {
        int i = 0;
        ListNode slow = head;
        ListNode fast = head;
        while(i <= n && fast != null){
            fast = fast.next;
            i++;
        }
        if(i < n)
            return head;
        if(i == n)
            return head.next;
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

