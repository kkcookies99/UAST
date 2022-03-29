 class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode cur = head;
        ListNode test = head.next;
        while(test!=null){
            while(test.val==cur.val){
                if(test.next==null){
                    cur.next=null;
                    return head;
                }
                test=test.next;
            }
            cur.next=test;
            cur=cur.next;
            test=cur.next;
        }
        return head;
    }
}

