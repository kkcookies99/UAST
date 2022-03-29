 var XXX = function(head) {
    if (!head || !head.next) return head;
    var cur = head;
    while(cur && cur.next) {
        if(cur.next.val == cur.val) {
            cur.next = cur.next.next;
        } else {
            cur = cur.next;
        }
    }
    return head;
    
};

