 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head == null){
            return null;
        }
        
        ListNode virtualHead = new ListNode(-1, head);

        ListNode fastNode = virtualHead;
        for (int i = 0; i <= n; ++i){
            fastNode = fastNode.next;
        }

        ListNode slowNode = virtualHead;
        while(fastNode != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }

        //删除slowNode后的节点
        slowNode.next = slowNode.next.next;

        return virtualHead.next;
    }
}


