var XXX = function(l1, l2) {
    let tempt=new ListNode(0),res=tempt,carry=0;
    while(carry||l1||l2){
        let x=l1?l1.val:0,y=l2?l2.val:0;
        let sum=x+y+carry;
        tempt.next=new ListNode(sum%10);
        tempt=tempt.next;
        carry=sum>=10?1:0;
        l1=l1?.next;
        l2=l2?.next;
    }
    return res.next;
};

