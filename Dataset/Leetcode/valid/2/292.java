class Solution {
    // 将l1 + l2链表的链表链接到l1上，如果l1链表较短，则将l2链表多的部分链接到l1链表上，这样做的好处是不用频繁的创建节点。
    public ListNode XXX(ListNode l1, ListNode l2) {
        // m:进位 x:相加的余数
        int m = 0, x = 0;
        // head：指向l1链表的头部，pre：指向l1链表移动的前一个元素
        ListNode head = l1, pre = l1;
        while(l1 != null || l2 != null){
            if(l1 == null){
                pre.next = l2;
                l1 = pre.next;
                l2 = null;
            }
            if(l1 != null && l2 != null){
                x = (l1.val + l2.val + m) % 10;
                m = (l1.val + l2.val + m) / 10;
            }else if(l1 != null){
                x = (l1.val + m) % 10; 
                m = (l1.val + m) / 10;
            }
            l1.val = x;
            pre = l1;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if(m != 0){
            pre.next = new ListNode(m);
        }
        return head;
    }
}

