 var XXX = function(head) {    
    if(!head||!head.next){
        return head;
    }
    let pre = head;
    let last = head.next;
    while(1){
        
        
        
        if(last.val == pre.val){
            
            
            pre.next = last.next;
            if(pre.next == null){
                break;
            }
            last.next = null;
            
            last = pre.next;
            
        }else{
            if(last.next != null){
                pre = pre.next;
                last = last.next;
            }else{
                break;
            }
            
        }
        
        
       
    }
    return head;
};