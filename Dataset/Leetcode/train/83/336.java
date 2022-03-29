class Solution {
    public ListNode XXX(ListNode head) {
        ListNode i = head, j=head;
        while(j != null){
           if(j.val != i.val){
                i.next = j;
                i = i.next;
            }
            j = j.next;
            if(j==null){
                i.next = null;
            }
        }
        return head;
    }
}

