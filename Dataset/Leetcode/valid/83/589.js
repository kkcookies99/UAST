 var XXX = function(head) {
  if (!head || !head.next) {
    return head
  }

  let node = XXX(head.next)

  if (head.val === node.val) {
    head.next = node.next
  }

  return head
};

