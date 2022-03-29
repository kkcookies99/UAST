 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode next=new ListNode(0);
        ListNode result=next;
        int p = 0;
        while(l1!=null||l2!=null){
            int v=0;
            if(l1!=null&&l2!=null){
                v=(l1.val+l2.val+p)%10;
                p=(l1.val+l2.val+p)/10;
                l1=l1.next;
                l2=l2.next;
            }
            else if(l1==null&&l2!=null){
                v=(l2.val+p)%10;
                p=(l2.val+p)/10;
                l2=l2.next;
            }
            else if(l1!=null&&l2==null){
                v=(l1.val+p)%10;
                p=(l1.val+p)/10;
                l1=l1.next;
            }
            next.val=v;
            if (l1==null&&l2==null&&p==0)
                next.next=null;
            else
                next.next=new ListNode(p);
            next=next.next;
        }
        return result;
    }
}

