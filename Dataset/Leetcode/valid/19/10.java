 class Solution {
    public ListNode XXX(ListNode head, int n) {
     ListNode myList =  new ListNode(-1,head);
     //双指针操作
     ListNode first=head;
     ListNode second=myList; 
     //先让第一个指针先遍历n步
     for(int i=1;i<n;i++){
         first=first.next;
     }
     //上面循环结束后，二个指针同时移动,直到第一个指针指向null截止
     while(first.next!=null){
         first=first.next;
         second=second.next;
     }
     //当上述while循环结束时，second已经到了要删除节点的前驱节点
      second.next=second.next.next;
      return myList.next;
    }
}

