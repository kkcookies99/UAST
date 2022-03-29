 class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null) return head;
        
        ListNode p = head;  // 指向无重复区间的末元素
        ListNode q = head.next; // 第一个与p不同的元素
        
        while (q != null) {
            if (q.val != p.val) {
                p.next = q;
                p = p.next;
            }
            q = q.next;
            
        }
        if (p != q) p.next = null;
        return head;
        
    }
}

