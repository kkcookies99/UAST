 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
     ListNode s=new ListNode(0),p=s;
     int jinwei=0;
     while(l1!=null || l2!=null){
         if(l1==null){
             s.next=new ListNode((l2.val+jinwei)%10);
             s=s.next;
             jinwei=(l2.val+jinwei)/10;
             l2=l2.next;
             continue;}
         if(l2==null){
             s.next=new ListNode((l1.val+jinwei)%10);
             s=s.next;
             jinwei=(l1.val+jinwei)/10;
             l1=l1.next;
             continue;}
         s.next=new ListNode((l1.val+l2.val+jinwei)%10);
         s=s.next;
         jinwei=(l1.val+l2.val+jinwei)/10;
         l1=l1.next;l2=l2.next;}
    if(jinwei==1){
        s.next=new ListNode(1);
        s=s.next;}
    return p.next;}
}

