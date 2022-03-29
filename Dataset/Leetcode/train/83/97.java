class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode p = head,q = p.next;//非重复指针，遍历指针
        while(q!=null){
            while(q!=null&&q.val==p.val) q=q.next;
            if(q!=null){
                p.next=q;
                p=q;
                q=q.next;
            }
            else p.next=null;//最后一个指针后面设为null
        }
        return head;
    }
}

