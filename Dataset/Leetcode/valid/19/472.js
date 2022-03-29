 var XXX = function(head, n) {
    var fast = head;
    var slow = head;
    for(var i = 0; i < n; i ++){
        if(fast != null){
            fast = fast.next;
        }
        
    }
    // 快指针走到头了，说明要删除第一个节点
    if(fast == null) return head.next;
    while(fast.next != null){
        fast = fast.next;
        slow = slow.next;
    }
    slow.next = slow.next.next;
    return head;
};

