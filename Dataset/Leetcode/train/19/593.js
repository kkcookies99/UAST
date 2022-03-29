 var XXX = function(head, n) {
  if(!head || !head.next) return null
  let
    pre = head,
    next = head.next,
    temp = null,
    fast = head
  while(n --) {
    fast = fast.next
  }
  while(fast) {
    temp = pre
    pre = next
    next = next.next
    fast = fast.next
  }
  if(temp) {
    temp.next = next
  } else {
    return head.next
  }
  return head
};

