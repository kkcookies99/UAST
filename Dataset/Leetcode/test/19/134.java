 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head==null)
            return head; 
        ListNode p = head;
        ListNode q =head;
        //用count记录走了多少步，和最终链表的长度
        int count=0;
        while(q.next!=null){
            count++;
            //前n步只让q指针走
            if(count<=n){
                q=q.next;
            }else{
                q=q.next;
                p=p.next;
            }
        }
        //循环结束时p到达了倒数n个元素的前面一个元素
        //两个特殊情况，即链表只有一个元素和要删除的为头节点的情况
        if(head.next==null || count+1 == n){
            head=head.next;
        }else{
            p.next=p.next.next; 
        }
        return head;
    }
}

