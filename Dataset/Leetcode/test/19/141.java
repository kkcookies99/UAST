 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode fast=head,slow=head;
        for(int i=0;i<n;i++) fast=fast.next;
        if(fast==null) return head.next;//删除头节点
        ListNode pre=head;
        fast=fast.next;
        slow=slow.next;
        while(fast!=null){
            fast=fast.next;
            pre=slow;
            slow=slow.next;

        }
        pre.next=slow.next;
        return head;

    }
}

