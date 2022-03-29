function XXX(l1, l2) {
  let curry = 0, node, prevNode;
  while (l1 || l2 || curry !== 0) {
    const val1 = l1?.val ? l1.val : 0;
    const val2 = l2?.val ? l2.val : 0;
    let sum = val1 + val2 + curry;
    curry = Math.floor(sum / 10);
    sum = sum % 10;

    const current = new ListNode(sum);
    if (prevNode) {
      prevNode.next = current;
    } else {
      node = current;
    }
    prevNode = current;

    l1 = l1?.next;
    l2 = l2?.next;
  }

  return node;
}

