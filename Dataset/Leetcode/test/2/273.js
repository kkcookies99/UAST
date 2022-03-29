var XXX = function(l1, l2) {
  let resultList = new ListNode(0);
  let tempNode = resultList;
  let decade = 0;
  while (l1 !== null || l2 !== null) {
    if (l1 !== null) {
      tempNode.val += l1.val;
      l1 = l1.next;
    }
    if (l2 !== null) {
      tempNode.val += l2.val;
      l2 = l2.next;
    }
    tempNode.val += decade;
    decade = 0;
    if (tempNode.val >= 10) {
      tempNode.val -= 10;
      decade = 1;
    }
    if (l1 !== null || l2 !== null) {
      tempNode.next = new ListNode(0);
      tempNode = tempNode.next;
    }
  }
  if (decade === 1) {
    tempNode.next = new ListNode(1);
  }
  return resultList;
};

