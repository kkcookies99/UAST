 class Solution {
	public ListNode XXX(ListNode l1, ListNode l2) {
		ListNode L = new ListNode();
		ListNode L1 = L;
		int n = 0;
		while (l1 != null || l2 != null) {
			int num = 0;
			if (l1 == null) {
				num = l2.val + n;
				l2 = l2.next;
			} else if (l2 == null) {
				num = l1.val + n;
				l1 = l1.next;
			} else {
				num = l1.val + l2.val + n;
				l2 = l2.next;
				l1 = l1.next;
			}
			n = (num) / 10;
			L.val = (num) % 10;
			if (l1 != null || l2 != null) {
				ListNode l = new ListNode();
				L.next = l;
				L = L.next;
			}
		}
		if (n == 1) {
			ListNode l = new ListNode();
			L.next = l;
			l.val = 1;
		}
		return L1;
	}
}


