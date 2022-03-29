class Solution {
    public ListNode XXX(ListNode head) {
    ListNode vir = new ListNode(101);
        vir.next=head;
        ListNode cur = head;
        ListNode pre = vir;
        while(cur!=null){
            if(cur.val!=pre.val){
                pre.next=cur;
                pre=cur;
                cur=cur.next;
            }else{
                cur=cur.next;
            }    
        }
        pre.next=null;

        return vir.next;
    }
}

