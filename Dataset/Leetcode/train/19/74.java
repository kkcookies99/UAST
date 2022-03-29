 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if (n<=0||head==null){
            return head;
        }
        //多加个节点 容易处理边界
        ListNode pre = new ListNode( -1,head);
        ListNode next = head;
        //1.快节点 先走 n步 
        while (n>0){
            n--;
            next=next.next;
            if (next==null){
                //如果 未走完 到头结点 则表示 超出范围 直接返回head  如果n是0 则表示刚好要去掉的是头节点
                return n==0?head.next:head;
            }
        }
        //2. 慢节点和快节点一起走
        while (next!=null){
            pre=pre.next;
            next=next.next;
        }
        ListNode temp = pre.next;
        pre.next=pre.next.next;
        temp=null;
        return head;
    }
}

