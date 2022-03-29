 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode pre =head;
        ListNode p =head;
        //移动间距使得p与pre距离为n
        while(n!=0){
            p=p.next;
            n--;
        }
        //头指针是否删除
        if(p==null){
            return head.next;
        }
        //移动到最后一个节点
        while(p.next!=null){
            p=p.next;
            pre=pre.next;
        }
        pre.next=pre.next.next;
        return head;
    }
}

