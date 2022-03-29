 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head==null||head.next==null) return null;        
        ListNode pre=head,cur=head;
        int temp = n;
        while(temp!=0){
            pre = pre.next;
            temp--;
        }
        if(pre==null)return head.next;
        while(pre!=null){
            cur = cur.next;
            pre = pre.next;
        }
        ListNode p = head;
        while(p.next != cur && p.next!=null)p = p.next;
        p.next = cur.next;
        cur.next = null;
        return head;
    }
}

