 var XXX = function(head, n) {
    if(!head || n <= 0) return null;
    let pHead = new ListNode(0);
    pHead.next = head;
    let fast = pHead, slow = pHead;
    for(let i = 0; i < n; i++){
        fast = fast.next;
    }
    while(fast.next){
        fast = fast.next;
        slow = slow.next;
    }
    slow.next = slow.next.next;
    return pHead.next;
};

