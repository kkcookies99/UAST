 var XXX = function(head) {
    var res=new ListNode("head"),
        Head=res;
    res.next=head;
    while(Head.next!==null){
        if(Head.val==Head.next.val){
            Head.next=Head.next.next;
        }else{
            Head=Head.next;
        }
    }
    return res.next;
};

