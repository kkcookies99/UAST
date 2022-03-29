 class Solution {
    public ListNode XXX(ListNode head, int n) {
     //链表中删除第n个节点
    ListNode dumm =new ListNode(0);
    dumm.next=head;
    ListNode pre=dumm;
    ListNode cur=dumm;
    int t=0;
    while(pre.next!=null){//快慢指针，先让快指针走n步，之后慢指针再走
        if(t>=n){    //快指针下一个节点为null时，就退出循环，此时慢指针下一个节点就是要删除的节点。
        cur=cur.next;
        }
       pre=pre.next;
        t++;
    }
   cur.next=cur.next.next;
       
   return dumm.next;

 }
}

