 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode cur=dummy;
        int a = getlength(head);
        if(a==1){return null;}
        for(int i =1;i<a-n+1;i++){
            cur=cur.next;
        }
        cur.next =cur.next.next; 
        return dummy.next;
    }
    public int getlength(ListNode head){
        if(head ==null){return 0;}
        int count = 1;
        while(head.next!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}

