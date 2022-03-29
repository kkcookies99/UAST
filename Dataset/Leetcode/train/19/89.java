 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode dummy = new ListNode(-1); //构建头节点
        dummy.next = head;
        ListNode low = dummy;//慢指针
        ListNode fast = dummy; //快指针，先移到第n个节点
        for(int i = 0; i < n; i++) {
            if(fast.next != null) {
                fast = fast.next;
            }
        }
        while(fast.next != null) {
            low = low.next;
            fast = fast.next;  
        }
        low.next = low.next.next;
        return dummy.next;
    }
}