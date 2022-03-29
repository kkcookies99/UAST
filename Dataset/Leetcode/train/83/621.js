 var XXX = function(head) {
      if(!head){return head;}  //尾部返回
      while(head.next&&head.val === head.next.val){
            head.next=head.next.next;    //   当前值跟下一个值 一样时， 跳过当前值
      }
     // console.log(head.val);
    XXX(head.next); //依次递归
    return head
    
};

