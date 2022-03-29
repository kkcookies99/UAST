 class Solution {
    public ListNode XXX(ListNode head, int n) {
        // if(n == 1)
        //     return null;
        // 增设虚拟头结点 统一首结点操作
        ListNode dummy = new ListNode(-1,head);
        // 快慢指针
        ListNode p = dummy, pre = dummy;
        while(p.next != null){
            if(n-- > 0){
                p = p.next;
                continue;
            }
            // 快指针走完n步后 一同走
            p = p.next;
            pre = pre.next;
        }
        // 删除倒数第n个结点
        pre.next = pre.next.next;
        return dummy.next;       
    }
}

