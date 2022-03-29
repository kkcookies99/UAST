 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(n <= 0 || head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(n >= 0){
            fast = fast.next;
            if(fast == null){
                if(slow.next == null){
                    return null;
                }
                if(n > 0){
                    head = head.next;
                    return head;
                }
            }
            n--;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

