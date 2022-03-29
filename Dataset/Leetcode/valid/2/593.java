 class Solution {
	public ListNode XXX(ListNode l1, ListNode l2) {
		if (l1 == null || l2 == null) {
			return null;
		}

		int sum = 0;
		ListNode head = new ListNode(0);
		ListNode current = head;
		int flag = 0;// 实现满十进一

		while (l1 != null && l2 != null) {
			sum = l1.val + l2.val + flag;

			flag = 0;// 上一轮导致的+1，加完之后清零。开启这一轮是否需要加1的判断
			if (sum >= 10) {
				sum = sum % 10;
				flag = 1; // 满十进一
			}

			current.next = new ListNode(sum);// 注意这里要new一个对象，不然会空指针异常。current.next之前并没有被实例化
			current = current.next;
			l1 = l1.next;
			l2 = l2.next;

		}

		// l1还有剩余
		while (l1 != null) {
			sum = l1.val + flag;

			flag = 0;
			if (sum >= 10) {
				sum = sum % 10;
				flag = 1;
			}

			current.next = new ListNode(sum);
			current = current.next;
			l1 = l1.next;

		}

		// l2还有剩余
		while (l2 != null) {
			sum = l2.val + flag;

			flag = 0;
			if (sum >= 10) {
				sum = sum % 10;
				flag = 1;
			}

			current.next = new ListNode(sum);
			current = current.next;
			l2 = l2.next;

		}
        
        //如果最后还剩一个进位的话
		if (flag == 1) {
			current.next = new ListNode(1);
		}

		return head.next;// 注意current指向的是尾结点，我们要通过头指针来找回链表头。
	}
}

