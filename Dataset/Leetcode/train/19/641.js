 var XXX = function(head, n) {
    let fast = head, slow = head, pre = head
    let len = 1,mid = 0
    // 记录中间位置
    while(fast&&fast.next){
        fast = fast.next.next
        pre = slow
        slow = slow.next
        len++
    }
    mid = len
    //                  长度为偶数   长度为奇数
    len = fast===null ? (len-1)<<1 : (len<<1)-1
    // 删除头节点
    if(n===len) return head.next
    // 计算删除元素正数位置
    const pos = len-n+1
    // 删除中间节点
    if(mid===pos) {
        pre.next = slow.next
        return head
    }
    // 左半边，从head开始遍历
    if(pos<mid){
        // 正数位置
        mid = len-n
        slow = head
    }else{
        // 右半边,从中间开始遍历
        mid = pos-mid
    }
    // 遍历删除
    while(mid-->0){
        pre = slow
        slow = slow.next
    }
    pre.next = slow.next
    return head
};

