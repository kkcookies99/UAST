 public ListNode XXX(ListNode head, int n) {
		ListNode rs = head;
		List<ListNode> list = new ArrayList<ListNode>();
		do {
			list.add(head);
			head = head.next;
		}while(head != null);
		int idx_self = list.size()-n;
		if(idx_self==0) {
			return rs.next;
		}
		ListNode last = list.get(idx_self-1);
		ListNode cur = list.get(idx_self);
		last.next = cur.next;
		return rs;
    }

