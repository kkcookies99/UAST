 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode fast = head, slow = head;
        //快指针先走n步，因为题目给出了n一定不大于链表长度，不用判断空指针
        for(int i = 0; i < n ; i++){
            fast = fast.next;
        }
        //fast走完变成null，说明删除的是头结点
        if(fast == null){
            return head.next;
        }
        /* 
        慢指针从头开始走,快指针从当前位置开始走，
        当快指针走到最后一个元素，慢指针刚好走到要删除元素的前面
        */
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        //覆盖下一个结点
        slow.next = slow.next.next;
        return head;
    }
}

