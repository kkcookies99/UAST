 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode slow = head, fast = head;
        
        try{
            while(n>=0){
                fast = fast.next;
                n--;
            }
        }catch(Exception e){
            return head.next;
        }

        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }

        ListNode next = slow.next.next;
        slow.next = next;
        return head;
    }
}

