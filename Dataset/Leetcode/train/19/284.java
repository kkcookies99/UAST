 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode cor = head, pre = head;
        while(cor.next != null){
            cor = cor.next;
            if(n-- <= 0) pre = pre.next;
        }
        if(n > 0) head = head.next;
        else pre.next = pre.next.next;
        return head;
    }
}

