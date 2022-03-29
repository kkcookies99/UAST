class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode pre=head;
        ListNode cur=head.next;
        while(cur!=null){
            if(cur.val!=pre.val){
                pre=cur;//更新pre
            }
            else{//删除cur节点
                pre.next=cur.next;
                
            }
            cur=cur.next;
        }
        return head;
    }
}

