 var XXX = function(head, n) {
    let ret = new ListNode(0,head);
    let slow = ret;
    let fast = ret;
    for(let i =0;i<=n;i++){ 
        fast = fast.next;
    }

    while(fast){
        fast = fast.next;
        slow = slow.next;
    }
    slow.next = slow.next.next;
    return ret.next;
};

