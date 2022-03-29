public ListNode XXX(ListNode l1, ListNode l2) {
    BigDecimal n1 = getOrigin(l1);
    BigDecimal n2 = getOrigin(l2);
    
    BigDecimal l = new BigDecimal(10);
    BigDecimal sum = n1.add(n2);
    ListNode l3 = new ListNode( sum .remainder( l).intValue());
    ListNode currNode = l3;
    while((sum.divide(l)).compareTo(new BigDecimal(1)) >= 0){
        sum = sum.divide(l);
        currNode.next = new ListNode( sum .remainder( l).intValue());
        currNode = currNode.next;
    };
    return l3;
}

public BigDecimal getOrigin(ListNode ll){
    BigDecimal n = new BigDecimal(ll.val);
    BigDecimal m = new BigDecimal(1);
    BigDecimal l = new BigDecimal(10);
    while(ll.next != null){
        m = m .multiply(l);
        n =  new BigDecimal(ll.next.val).multiply(m).add(n);
        ll=ll.next;
    }
    return n;
}
