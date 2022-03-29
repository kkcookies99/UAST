 var XXX = function(l1, l2) {
    const result = new ListNode((l1.val + l2.val) % 10);
    
    if(l1.next || l2.next || l1.val + l2.val >= 10){
        if(l1.next === null){
            l1.next = new ListNode(0);
        }

        if(l2.next === null){
            l2.next = new ListNode(0);
        }
        
        if(l1.val + l2.val >= 10){
            l1.next.val++
        }
        result.next = XXX(l1.next, l2.next);
    }
    return result
};

