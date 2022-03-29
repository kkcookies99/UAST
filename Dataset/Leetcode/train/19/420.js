 var XXX = function(head, n) {
    if(head.next === null){
        head = null
        return head
    }
    let l1 = head
    let l2 = head
    let i =1;
    let j =1;
    while(l1.next){
        i++
        l1 = l1.next
    }
    if(i-n===0){
        head = head.next
        return head
    }
    while(j<i-n){
        j++
        l2=l2.next
    }
    if(n>=2){
    l2.next = l2.next.next
    }else{
        l2.next = null
    }
    return head
};

