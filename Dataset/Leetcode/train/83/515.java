 class Solution {
    public ListNode XXX(ListNode head) {
        ListNode myHead = head;
        ListNode tail = myHead;
        while(tail!=null){
            if(myHead.val!=tail.val){//不相等
                myHead.next = tail;
                myHead = myHead.next;
            }
            tail = tail.next;//相等
        }
        if(tail==null){
            if(myHead!=null){
                myHead.next = null;
            }
        }
        return head;
    }
}

