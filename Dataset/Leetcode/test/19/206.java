 class Solution {
    public ListNode XXX(ListNode head, int n) {
        //考虑到删除的节点可能是第一个节点，所以在头部添加一个empty节点
        ListNode empty = new ListNode(0, head);
        ListNode fast = empty;
        ListNode slow = empty;

        //快指针往后走n步，使得快指针与慢指针的距离为n
        for (int i = 1; i <= n; i++) {
            if (fast.next == null) {
                break;
            }
            fast = fast.next;
        }
        
        //快慢指针同时往后走，直到快指针走到最后一个结点
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        //此时slow就是要删除节点的前驱节点，那么删除slow的后驱节点即可
        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        return empty.next;
    }
}

