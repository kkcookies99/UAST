 class Solution {
    public ListNode XXX(ListNode head, int n) {
        return removeNode(head,n)==n?head.next:head;
	}	
	public int removeNode(ListNode node,int n) {		
		if(node.next == null)  return 1;
		int m = removeNode(node.next, n);
		if(m == n)  node.next = node.next.next;
		return m+1;
	}
}

