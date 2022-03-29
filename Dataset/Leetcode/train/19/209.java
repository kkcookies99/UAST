 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode current = head;
        ListNode pre = head;
        ListNode right = null;
        ListNode left = null;
        
        while(n >= 0){
            if(current == null){
                head = head.next;
                return head;
            }
            right = current;
            current = current.next;
            n--;
        }
        while(right != null){
            left = pre;
            pre = pre.next;
            right = right.next;
        }
        left.next = left.next.next;
        return head;
    }
}

