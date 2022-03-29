var XXX = function(head) {
    if(head == null) {
        return head
    }
    let headItem = head
    while(headItem.next != null) {
        if(headItem.val == headItem.next.val) {
            headItem.next = headItem.next.next
        } else {
            headItem = headItem.next
        }
    }
    return head
};

