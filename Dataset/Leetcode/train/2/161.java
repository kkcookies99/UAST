class Solution {
    int jinw = 0;
    ListNode res = new ListNode();
    ListNode nex = res;
    public ListNode XXX(ListNode l1, ListNode l2) {      
        if(null != l1 || null != l2 || 0 != jinw){//0不等于jinw，l1、l2不是null，说明有下一个节点
            nex.next = new ListNode();
            nex = nex.next;//nex指向最新生成的node
            int cur = jinw + (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            jinw = cur/10;
            nex.val = cur%10;
            XXX(l1 == null ? null : l1.next, l2 == null ? null : l2.next);
        }
        return res.next;
    }
}

