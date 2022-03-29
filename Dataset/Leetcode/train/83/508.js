 var XXX = function(head) {
    let res = [];
    while(head) {
        res.push(new ListNode(head.val));
        head = head.next;
    }
    if(!res.length) return null;
    for(let i = res.length-1; i > 0; i--) {
        if(res[i].val === res[i-1].val) {
            res.splice(i,1);
        }
    }
    for(let j = 0, len = res.length; j < len - 1; j++) {
        res[j].next = res[j+1];
    }
    return res[0];
};

