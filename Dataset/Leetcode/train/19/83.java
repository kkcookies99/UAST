 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode fake_head = head;
        ListNode quick_point = head;
        // 快指针先走， 用快指针指示慢指针所在的位置
        for(int i=0; i<n; i++){
            quick_point = quick_point.next;
        }
        // 如果快指针走到null 说明删除的应该是第一个节点
        if(quick_point == null){
            return fake_head.next;
        }
        // 当快指针走到next指向空，此时慢指针走到待删除节点之前的位置。
        while(quick_point.next!=null){
            head = head.next;
            quick_point = quick_point.next;
        }
        head.next = head.next.next;
        return fake_head;
    }
}

