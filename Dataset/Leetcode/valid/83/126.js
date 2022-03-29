var XXX = function(head) {
    let current = head;
    let last = {val: null};
    
    while(current) {
        if(current.val !== last.val) {
            last = current;
        } else {
            last.next = current.next;
        }
        current = current.next;
    }
    
    return head;
};

