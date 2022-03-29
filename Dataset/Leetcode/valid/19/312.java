 	public ListNode XXX(ListNode head, int n) {
		if (head == null || n <= 0) {
			return head;
		}

		int size = size(head);
		if (size == n) {
			head = head.next;
		} else if (size > n) {
			ListNode p = head;
			int i = 1;
			while (i++ < size-n) {
				p = p.next;
			}
			p.next = p.next.next;
		}

		return head;
	}

	private int size(ListNode node) {
		int size = 0;
		while (node != null) {
			size++;
			node = node.next;
		}

		return size;
	}

