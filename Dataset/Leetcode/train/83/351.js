var XXX = function(head) {
  if(!head) return null
  let dummy = pre = new ListNode(null), cur = head
  dummy.next = head
  while(cur) {
    if (pre.val === cur.val) {
      pre.next = cur.next
      cur = pre.next
    } else {
      pre = cur
      cur = cur.next
    }
  }
  return dummy.next
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


