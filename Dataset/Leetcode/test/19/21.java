 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode listNode = new ListNode();
        listNode.next=head;
        find(listNode,n);
        return listNode.next;
    }

     public  int find(ListNode node,int n){
        if (node==null) return 0;
        int i = find(node.next, n)+1;
        if (i-1==n){
            node.next=node.next.next;
        }
        return i;
    }
}

