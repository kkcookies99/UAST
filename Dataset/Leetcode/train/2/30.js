var XXX = function(l1, l2) {
    let l3 = stemp = {}
    let flag = 0
    while(l1 || l2 || flag) {
        let val = (l1?.val || 0 ) + (l2?.val || 0) + flag
        flag = val >= 10 ? 1 : 0
        l1  = l1?.next 
        l2  = l2?.next
        l3["val"] = val % 10
        l3["next"] = !l1 && !l2 && !flag ? null : {}
        l3 = l3.next 
    }
    return stemp
};