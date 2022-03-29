class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null){
            return head;
        }
        //快慢指针
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null){

            while(slow.val == fast.val){
                //删除这个元素   要知道这个元素的上一个元素
                if(fast.next!=null){
                    slow.next = fast.next;
                    fast = fast.next;
                }else{
                    slow.next = null;
                    return head;
                }
            }
            fast = fast.next;
            if(fast == null){
                return head;
            }
            slow = slow.next;
        }
        return head;
    }
}

