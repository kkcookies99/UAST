var XXX = function(l1, l2) {
    var res = new ListNode(0);
    var temp = res;
    var carry = 0;
    while(l1 || l2){
        var x = l1?l1.val:0;
        var y = l2?l2.val:0;
        var sum = x + y + carry;
        carry = parseInt(sum/10);
        temp.next = new ListNode(sum % 10);
        temp = temp.next;
        if(l1)
            l1 = l1.next;
        if(l2)
            l2 = l2.next;
    }
    if(carry > 0)
        temp.next = new ListNode(1);
    return res.next;
};

