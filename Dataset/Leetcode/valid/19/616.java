 class Solution {
    public ListNode XXX(ListNode head, int n) {
        int length = 0;
	ListNode getLengthNode = head;
	while (getLengthNode != null) {
		++length;;
		getLengthNode = getLengthNode.next;
	}
	if (n == length) {
		head = head.next;
		return head;
	}
	ListNode findDeleteNode = head;
	while (findDeleteNode != null) {
		--length;
		if (length == n) {
			findDeleteNode.next = findDeleteNode.next.next;
			break;
		}
		findDeleteNode = findDeleteNode.next;
	}
	return head;
    }
}

