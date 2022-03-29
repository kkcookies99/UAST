 var XXX = function(head, n) {
  let target = head,
      cur = head;
  while (n--) {
    cur = cur.next; 
  }
  while (cur && cur.next) {
    cur = cur.next;
    target = target.next;
  }
  if (!cur) return head.next;
  target.next = target.next.next;
  return head;
};

