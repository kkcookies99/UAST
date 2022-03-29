 class Solution {
    private static int num = 1;
    public ListNode XXX(ListNode head, int n) {
                if (null == head) {
                        return head;
		}
		ListNode finalNextNode = XXX(head.next, n);
		if (num == n) {
			num++;
			return head.next;
		} else if (num - n == 1) {
			head.next = finalNextNode;
		}
		num++;
		return head;
    }
}

