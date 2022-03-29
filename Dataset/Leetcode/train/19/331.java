     public ListNode XXX(ListNode head, int n) {
        return whereIsMe(head,n) == n? head.next:head;
    }
    public int whereIsMe(ListNode node,int n){
        if(node.next == null ) return 1;
        int count = whereIsMe(node.next,n);
        if(count == n) node.next = node.next.next;
        return count + 1;
    }

