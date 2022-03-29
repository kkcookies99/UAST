var XXX = function(head) {
  if(!(head&&head.next)) return head
  let l = head, r = head
  while(r){
    if(r.val!==l.val){
      l.next = r
      l = r
    }
    r = r.next
  }
  l.next = null
  return head
};

