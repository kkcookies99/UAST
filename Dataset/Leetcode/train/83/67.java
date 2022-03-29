class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode hair = head;//记录头结点的位置
        
      while(head.next!=null){//如果head到了最后一个就跳出
          if(head.val==head.next.val){//如果head=下一个
              while(head.val==head.next.val){
 
                 if( head.next.next==null){//如果一直循环下去，说明一直到末尾，都是这个重复的数字，直接让head的next=null
                     head.next=null;
                     return hair;
                 }
                  head.next=head.next.next;//循环移动head.next的位置，直到不重复为止
              }
          }

          head=head.next;//移动head的位置

      }
      return hair;
    }
}

