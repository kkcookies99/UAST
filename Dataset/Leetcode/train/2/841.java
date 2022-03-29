 	public ListNode XXX(ListNode l1, ListNode l2) {
		ListNode prev = new ListNode(0);
		ListNode head = prev;
		int temp = 0;
		while (l1 != null || l2 != null || temp != 0) {
			ListNode cur = new ListNode(0);
			int num = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + temp;
			cur.val = num % 10;
			temp = num / 10;
			prev.next = cur;
			prev = cur;
			l1 = l1 == null ? l1 : l1.next;
			l2 = l2 == null ? l2 : l2.next;
		}
		return head.next;
	}

