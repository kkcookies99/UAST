 var XXX = function(head) {
    var p = head;
    while(1){
       
        if(p==null||p.next==null)
                break;
        while(p.next.val == p.val){
            p.next = p.next.next; 
            if(p.next==null)
                break;
        }
        p = p.next;
          
    }
    return head;
};

