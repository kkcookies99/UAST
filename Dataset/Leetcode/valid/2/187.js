var XXX = function (l1, l2) {
  let tail = new ListNode(null);
  let head = tail;
  let carry = 0;
  while (carry || l1 || l2) {
    const n1 = l1 ? l1.val : 0;
    const n2 = l2 ? l2.val : 0;
    const sum = n1 + n2 + carry;
    head.next = new ListNode(sum % 10);
    head = head.next;
    carry = Math.floor(sum / 10);
    if (l1) l1 = l1.next;
    if (l2) l2 = l2.next;
  }
  return tail.next;
};

