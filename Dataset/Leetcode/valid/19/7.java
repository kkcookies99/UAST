 class Solution {
    public ListNode XXX(ListNode head, int n) {
        // 双指针的思想
        // 定义一个快指针,定义一个慢指针
        ListNode slow = head;
        ListNode fast = head;
        // 先让快指针走n步
        while(n--!=0){
            fast=fast.next;
        }
        // 如果快指针走到了最后说明删除的是第一个节点,就返回head.next就好
        if(fast==null){
            return head.next;
        }
        // 使得slow每次都是在待删除的前一个节点, 所以要先让fast先走一步
        fast=fast.next;
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        // 因为已经保证了是待删除节点的前一个节点, 直接删除即可
        slow.next=slow.next.next;
        return head;
    }
}

