 var XXX = function(head) {
    if(!head){
        return null;
    }

    let node = head;
    while(node.next != null){
        if(node.next.val == node.val){
            node.next = node.next.next;
        }else{
            node = node.next;
        }
    }
    
    return head;
};

