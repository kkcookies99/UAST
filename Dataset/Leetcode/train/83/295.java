class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null || head.next == null) 
            return head;
        // 双指针
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null){
            // 快慢指针值相同，或指向的内存地址相同，快指针都往前一步
            if(slow.val==fast.val || slow==fast)
                fast = fast.next;
            // 此时快慢指针值不同
            else{
                slow.next = fast; // 跳过快慢指针中间的节点，直接慢指针指过去
                slow = slow.next; // 然后慢指针往前一步和快指针对齐
            }
        }
        // 此时快指针为null,慢指针的值就是最大的值,直接指向null的快指针，链表结束
        slow.next = fast;
        // 返回链表头
        return head;
    }

