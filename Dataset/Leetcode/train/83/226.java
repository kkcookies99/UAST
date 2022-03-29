public ListNode XXX(ListNode head) {
        if (head == null) {
            return head;
        }
        ArrayList<Integer> listset = new ArrayList<Integer>();
		listset.add(head.val);
        
		ListNode cur = head;
		ListNode prev = head;
		
		while (cur != null) {
			if (!listset.contains(cur.val)) {
				listset.add(cur.val);
				prev = cur;
			} else {
                prev.next = cur.next;
            }
			cur = cur.next;
		}
		return head;
    }

