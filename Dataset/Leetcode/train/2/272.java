public ListNode XXX(ListNode l1, ListNode l2) {

    ListNode result = new ListNode(0);

    sumByBit(l1, l2, result);

    return result;
}

private void sumByBit(ListNode l1, ListNode l2, ListNode result) {
    int sum = l1.val + l2.val + result.val;
    result.val = sum % 10;
    // 进位
    int carry = sum / 10;
    if (l1.next == null && l2.next == null && carry == 0) {
        return;
    }
    if (l1.next == null) {
        l1.next = new ListNode(0);
    }
    if (l2.next == null) {
        l2.next = new ListNode(0);
    }
    sumByBit(l1.next, l2.next, result.next = new ListNode(sum / 10));
}



