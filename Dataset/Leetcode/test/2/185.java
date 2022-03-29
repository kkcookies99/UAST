class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        int sum = 0;
        ListNode cur = listNode;
        while(l1!=null||l2!=null) {
        	if(l1!=null) {
        		sum+=l1.val;
        		l1 = l1.next;
        	}
        	if(l2!=null) {
        		sum+=l2.val;
        		l2 = l2.next;
        	}
        	cur.next = new ListNode(sum%10);
        	sum/=10;
        	cur = cur.next;
        }
        if(sum>=1) {
        	cur.next = new ListNode(sum);
        }
        return listNode.next;
    }
}