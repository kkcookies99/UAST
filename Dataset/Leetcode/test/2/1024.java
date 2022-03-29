 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        int add=0;
        ListNode ans= new ListNode(0);
        ListNode copy=ans;
        while(l1!=null || l2!=null)
        {
           
            int x = l1!=null?l1.val:0;
            int y = l2!=null?l2.val:0;

            ListNode temp= new ListNode((x+y+add)%10);
            add=(x+y+add)/10;
            ans.next=temp;
            ans=temp;

            if(l1!=null && l2!=null)
            {
                l1=l1.next;
                l2=l2.next;
            }
        }
        if(add!=0)
        {
            ListNode temp= new ListNode(add);
            ans.next=temp;
        }

        return copy.next;

    }
}

