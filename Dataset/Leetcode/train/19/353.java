 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode l=temp;
        ListNode r=head;
        head=temp;
        for(int i=0;i<n;i++){
            r=r.next;
        }
        while(r!=null){
            r=r.next;
            l=l.next;
        }
        l.next=l.next.next;
        //注意删除第一个节点的情况
        return head.next;
    }
}

