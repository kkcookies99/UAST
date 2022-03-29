 class Solution {
    public ListNode XXX(ListNode head, int n) {
        //快指针提前先走n步
        ListNode fast = head;   
        while(n > 0){
            fast = fast.next;
            n--;
        }
        //如果此时快指针已经为空了，说明待删除的是头节点，直接返回结果
        if(fast == null) return head.next;
        ListNode slow = head;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        //此时slow指向的是待删除节点的前一个前点
        slow.next = slow.next.next;
        return head;
    }
}

