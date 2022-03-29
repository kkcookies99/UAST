 class Solution {
    public ListNode XXX(ListNode head) {
        int cur_v = 0;
        int next_v = 0;
        ListNode cur_n = head;
        while(cur_n!=null && cur_n.next!=null){
            //获取当前节点的值
            cur_v = cur_n.val;
            //获取当前节点的下一个节点的值
            next_v = cur_n.next.val;
            //若是当前节点的值和下一个节点的值相等
            if(cur_v == next_v){
                cur_n.next = cur_n.next.next;
            }else{
                cur_n = cur_n.next;
            }
        }
        return head;
    }
}

