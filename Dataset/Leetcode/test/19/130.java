 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode dummyNode  = new ListNode(0) ;//定义虚拟头节点，避免分类讨论
        dummyNode.next =head;
        ListNode pre = dummyNode;
        ListNode cur = head;
        int cnt = 0;
        while(cur != null){
            if(cnt >= n){//大于等于n的时候同时移动
                pre = pre.next;
            }
            cur = cur.next;
            cnt++;
        }
        pre.next = pre.next.next;
        return dummyNode.next;
    }
}

