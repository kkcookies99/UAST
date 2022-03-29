class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        int inc=0;
        int temp=0;
        ListNode node=new ListNode(-1);
        ListNode res=node;
        
        while(l1!=null &&l2!=null){ 
            temp= l1.val+l2.val+inc;
            inc=temp/10;
            temp=temp%10;
            l2.val=temp;
            node.next=l2;
            l1=l1.next;
            l2=l2.next;
            node=node.next;
        }
        while(l1!=null){
           temp= l1.val+inc;
            inc=temp/10;
            temp=temp%10;
            l1.val=temp;
            node.next=l1;
            l1=l1.next;
            node=node.next; 
        };
        if(inc!=0){
            node.next=new ListNode(inc);
        }
        while(l2!=null){
           temp= l2.val+inc;
            inc=temp/10;
            temp=temp%10;
            l2.val=temp;
            node.next=l2;
            l2=l2.next;
            node=node.next;
        }
        if(inc!=0){
            node.next=new ListNode(inc);
        }
        return res.next;
    }
}

