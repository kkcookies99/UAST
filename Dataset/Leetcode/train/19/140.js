 var XXX = function(head, n) {
    if(head.next === null){
        return n === 0 ? head : []
    }
    let i = 0
    let pre = head
    let ans = head
    while (head.next !== null){
        if (i > n-1){
            pre = pre.next
            head = head.next
        }else{
            head = head.next
        }
        i++
    }
    pre.next = pre.next.next
    return ans
};

