 class Solution {
    public ListNode XXX(ListNode head, int n) {
            if(head.next==null){
                return null;
            }
            //倒数第n个数，就让快指针多走n步
            int moreSteps=n;
            //定义快慢指针
            ListNode slowNode=head;
            ListNode fastNode=head;
            //让快指针先走n步
            for(int i=0;i<moreSteps;i++){
                fastNode=fastNode.next;
            }
            //如果快指针走完到null了，证明n等于 链表长度，直接删除第一个元素即返回head.next
            if(fastNode==null){
                return head.next;
            }
            //只要快指针下一个指针不为null，就同时移动快慢指针，停下后的slowNode.next即为要删除的节点
            while(fastNode.next!=null){
                fastNode=fastNode.next;
                slowNode=slowNode.next;
            }
            slowNode.next=slowNode.next.next;
            return head;
    }
}


