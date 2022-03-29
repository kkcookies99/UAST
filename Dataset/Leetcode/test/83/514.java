 class Solution {
    public ListNode XXX(ListNode head) {
        ListNode cur = head;
        while(cur!=null){
            ListNode nex = cur.next;
            if(nex!=null&&cur.val==nex.val){
                cur.next = nex.next;
            }else{
                cur=cur.next;
            }
        }
        return head;
    }
}

