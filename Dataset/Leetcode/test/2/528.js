 var XXX = function(l1, l2) {
    let m = l1.val + l2.val
    let madd = m>9 ? 1 : 0 
    m = m>9 ? m-10 : m 
    let ln = new ListNode(m);
    while(!!l1.next || !!l2.next){
        if (!!l1.next && !!l2.next) {
            l1=l1.next
            l2=l2.next
            m = l1.val + l2.val + madd
            madd = m>9 ? 1 : 0;
            m = m>9 ? m-10 : m 
            let newNode=new ListNode(m);
            newNode.next = ln;
            ln = newNode
        }else if(!!l1.next) {
            l1 = l1.next
            m = l1.val + madd
            madd = m>9 ? 1 : 0;
            m = m>9 ? m-10 : m 
            let newNode=new ListNode(m);
            newNode.next = ln;
            ln = newNode
        }else {
            l2 = l2.next
            m = l2.val + madd
            madd = m>9 ? 1 : 0;
            m = m>9 ? m-10 : m 
            let newNode=new ListNode(m);
            newNode.next = ln;
            ln = newNode
        }
    }
    if(madd === 1) {
        let newNode=new ListNode(madd);
        newNode.next = ln
        ln = newNode
    }
    let nln = new ListNode(ln.val)
    while (!!ln.next) {
        let newNode=new ListNode(ln.next.val);
        newNode.next = nln
        nln = newNode
        ln = ln.next
    }
    return nln
};

