 class Solution {
    public ListNode XXX(ListNode head, int n) {
        // 边界处理：只有一个结点
        if(head.next == null){
            head = null;
            return head;
        }
            
        ListNode slow = head;
        ListNode fast = head;

        // 让快指针走n步
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        // 边界处理：如果fast指针越界，说明删除头结点
        if(fast == null){
            return head.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}

