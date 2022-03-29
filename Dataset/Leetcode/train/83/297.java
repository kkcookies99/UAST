class Solution {
    public ListNode XXX(ListNode head) {
        if(null == head){
            return head;
        }
        ListNode tail = head;
        ListNode next = head.next;
        while(null != next){
            if(tail.val == next.val){
                next = next.next;
            }else{
                tail.next = next;
                tail = next;
                next = next.next;
            }
        }
        if(tail.next!=null && tail.val == tail.next.val){
            tail.next = null;
        }
        return head;
    }
}


