 public ListNode XXX(ListNode head) {
		ListNode listNode = null;
		ListNode temp;
		listNode = head;
		while(head != null && head.next != null) {    //里面的判别条件不能写反，即：head.next != null && head != null 会报错，因为&&是短路与，对于空链[]会报错 
			if(head.val == head.next.val) {
				temp = head.next.next;
				head.next.next = null;
				head.next = temp;				
			}
			else {
				head = head.next;
			}
			
		}
		return listNode;
    }

