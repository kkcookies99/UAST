class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        //当前结构
        head.next = XXX(head.next);
        if(head.val == head.next.val){
            ListNode l = head.next.next;
            head.next = XXX(l);
        }
        return head;
    }
}```

