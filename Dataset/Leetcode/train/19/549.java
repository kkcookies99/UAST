 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode p = head;
        while(n>0){//p往前走n步
            p = p.next;
            n--;
        }
        ListNode pre = new ListNode(0,head);
        ListNode q = pre;
        while(p!=null){//当p==null,此时q在要删除的结点前面一个结点
            p =  p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return pre.next;
    }
}

