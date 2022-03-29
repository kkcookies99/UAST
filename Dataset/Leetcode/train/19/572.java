 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if (head==null||head.next==null) return null;
        int length=getNth(head,n);
        return length==n?head.next:head;
    }
    public int getNth(ListNode node,int n){
        if(node==null) return 0;
        int nth= getNth(node.next,n)+1;
        if(nth==n+1){
           node.next=node.next.next;
        }
        return nth;
    }
}

