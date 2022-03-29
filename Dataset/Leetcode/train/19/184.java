 public ListNode XXX(ListNode head, int n) {
        ListNode ln1 = head;
		ListNode ln2 = head;
		int index = 0;
		while (ln2.next != null) {
			if (index < n) {
				index++;
				ln2 = ln2.next;
			} else {
				ln2 = ln2.next;
				ln1 = ln1.next;
			}
		}
		if (index == n - 1) {
			return head.next;
		}
		ln1.next = ln1.next.next;
		return head;
    }

