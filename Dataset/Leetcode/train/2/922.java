 class Solution {
	public ListNode XXX(ListNode l1, ListNode l2) {
		ListNode root = new ListNode(0);
		ListNode cursor =root;
		int upper = 0;
		while (l1 != null || l2 != null || upper!=0) {
			int value1 = l1 == null ? 0 : l1.val;
			int value2 = l2 == null ? 0 : l2.val;
			int value = value1 + value2 +upper;
			int current = value %10;
			upper = value / 10;
			
			ListNode next = new ListNode(current);
			cursor.next =next;
			cursor = next;
			
			if(l1!=null) {
				l1=l1.next;
			}
			if(l2!=null) {
				l2=l2.next;
			}
		}
		return root.next;
	}
}

