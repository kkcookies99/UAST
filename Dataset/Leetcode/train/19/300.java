 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head ==null) return head;
        if(head.next==null && n==1) return null;
        ListNode loop=head;
        int l=0;
        ListNode mark = head ;
        ListNode temp =null;
        while (loop !=null){
            if (l==n){
                temp=mark;
                mark =mark.next;
            }else{
                l++;
            }
            loop=loop.next;
        }
       if(mark.next ==null) {
           temp.next=null;
       }else{
           mark.val=mark.next.val;
           mark.next=mark.next.next;
       }
        return head;
    }
}

