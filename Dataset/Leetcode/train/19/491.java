 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode fast, slow; // 快慢指针
        slow = fast = head;
        while(n-- > 0){
            // 快指针先走n步
            fast = fast.next;
        }

        if(fast == null){
            // 直接走到头了，这种情况是直接去掉头节点
            return slow.next;
        }

        // 快指针到终点时，慢指针到达倒数第n个节点
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        // n指针指向下下个node,跳过第N个节点
        slow.next = slow.next.next;

        return head;
    }
}

