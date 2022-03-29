 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head==null ){
            return null;
        }
        int len = 0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next!=null){
            len++;
            fast = fast.next;
            if(len>n){
                slow = slow.next;
            }
        }
        if(len+1==n){
            head = head.next;
            slow = null;
        }
        else{
            ListNode temp = slow.next.next;
            slow.next.next = null;
            slow.next = temp;
        }
        return head;
    }
}

