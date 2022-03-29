class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null||head.next==null){return head;}
        head.next = XXX(head.next);
        return head.val==head.next.val ? head.next:head;
    }
}

