 class Solution {
	public ListNode XXX(ListNode l1, ListNode l2) {
		List<Integer> firstNums = new ArrayList<Integer>();
		List<Integer> secondNums = new ArrayList<Integer>();
		while (l1 != null) {
			firstNums.add(l1.val);
			l1 = l1.next;
		}
		while (l2 != null) {
			secondNums.add(l2.val);
			l2 = l2.next;
		}
		long firstValue = getValue(firstNums);
		long secondValue = getValue(secondNums);
		long res = firstValue + secondValue;
		return construct(res);
	}

	private ListNode construct(long value) {
		List<ListNode> nodes = new ArrayList<ListNode>();
		while (value / 10 > 0) {
			int lastNum = (int)(value%10);
			ListNode node = new ListNode(lastNum);
			nodes.add(node);
			value = value / 10;
		}
		ListNode node = new ListNode((int)value);
		nodes.add(node);
		int length = nodes.size();
		ListNode res = nodes.get(0);
		for (int i = 1;i< length;i++) {
			ListNode tem = nodes.get(i);
			ListNode temp = res;
			for (int j =0;j<i-1;j++) {
				temp = temp.next;
			}
			temp.next = tem;
		}
		return res;
	}

	private long getValue(List<Integer> lst) {
		if (lst == null) {
			return 0;
		}
		long res = 0;
		int legth = lst.size();
		for (int i = legth; i >= 1; i--) {
			int temp = lst.get(i - 1);
			res += temp * getTen(i-1);
		}
		return res;
	}

	private long getTen(int length) {
		long res = 1;
		for (int i = 0; i < length; i++) {
			res = res * 10;
		}
		return res;
	}
}

