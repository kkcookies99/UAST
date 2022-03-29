 var XXX = function(l1, l2) {
    let test = new ListNode();
    let re_list = test;
    let in_num = 0;
    let p,q;
    while(l1 || l2)
        {
            p = l1 ? l1.val : 0;
            q = l2 ? l2.val : 0;
            test.val = (p + q + in_num) %10;
            in_num = Math.floor((p + q + in_num) / 10);
            test.next = new ListNode();
            l1 = l1 ? l1.next : null;
            l2 = l2 ? l2.next : null;
            
            if(l1 || l2)
                {
                    test = test.next;   
                }
        }
    
    if(in_num)
        {
            test.next = new ListNode(in_num);
        }else
            {
                test.next = null;
            }
    return re_list;
};

