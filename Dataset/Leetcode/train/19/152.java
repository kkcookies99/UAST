 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 0; i < n && fast != null; i++){
            fast = fast.next;
        }
        if(fast == null) return head.next;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

