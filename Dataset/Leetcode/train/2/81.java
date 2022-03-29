class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
	ListNode answerListNode = listNode;
        //解决头结点有值的问题
	listNode.val = (l1.val+l2.val) %10;
	int temp = (l1.val + l2.val) / 10;
	l1 = l1.next;
	l2 = l2.next;
        //从第二位开始相加，直到有一个链表为空
        while (l1 != null && l2 != null) {
		ListNode node = new ListNode();
                //存储num值，避免多次计算num的值
		int num = (temp + l1.val + l2.val);
		node.val = num % 10;
		node.next = null;
		listNode.next = node;
		temp = num / 10;
                //节点后移
		l1 = l1.next;
		l2 = l2.next;
		listNode = listNode.next;
	}
        //判断l1是否为空，不为空则代表还有元素未加
        if (l1 != null) {
		while (l1 != null) {
			ListNode node = new ListNode();
			int num = (temp + l1.val);
			node.val = num % 10;
			node.next = null;
			listNode.next = node;
			temp = num / 10;
			l1 = l1.next;
			listNode = listNode.next;
		}
	}
        //l2跟l1同理
        if (l2 != null) {
        	while (l2 != null) {
			ListNode node = new ListNode();
			int num = (temp + l2.val);
			node.val = num % 10;
			node.next = null;
			listNode.next = node;
			temp = num / 10;
			l2 = l2.next;
			listNode = listNode.next;
		}
	}
        //可能加到最后有进位，如果不为0就表示有进位，得加上这个进位值
        if (temp != 0) {
		ListNode node = new ListNode();
		node.val = temp;
		node.next = null;
		listNode.next = node;
		listNode = listNode.next;
	}
        return answerListNode;
    }
}

