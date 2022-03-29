 var XXX = function(head) {
   var p = head
   while(p&&p.next){
           if(p.val == p.next.val){
               p.next = p.next.next
           }else{
               p = p.next
           }
   }
    return head
};

