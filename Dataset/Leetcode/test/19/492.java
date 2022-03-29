 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head == null) return head;
        int len = 0;
        ListNode dummy = head;
        while(dummy != null){
            len++;
            dummy = dummy.next;
        }
        int account = len-n;
        if(account == 0) {
            head = head.next;
            return head;
        }
        dummy = head;
       for(int i=1;i<account;i++){
        dummy = dummy.next;
       }
       dummy.next = dummy.next.next;
       return head;
    }
}

