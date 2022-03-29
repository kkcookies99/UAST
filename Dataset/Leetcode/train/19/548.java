 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode newNode=new ListNode(-1,head);//他的节点的下一个指向head,这样就不用考虑头结点了
        ListNode  l=newNode,r=newNode;
        for(int i=0;i<=n;i++){
            //先走n+1个(这样慢的就会停在要删除的前面)
            r=r.next;
        }

        while(r!=null){
            l=l.next;
            r=r.next;
        }
        //删除
        l.next=l.next.next;
        return newNode.next;

    }
}

