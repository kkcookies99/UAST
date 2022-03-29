 var XXX = function(head) {
    if(!head) return null
    let pre = head
    cur = pre.next
    if(!cur) return head
    while(cur) {
        if(cur.val === pre.val) {
            cur = cur.next
            pre.next = cur
        } else {
            pre = cur
            cur = cur.next
        }
    }
    return head
};

