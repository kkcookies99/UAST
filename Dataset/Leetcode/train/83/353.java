class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null) return null;
        ListNode temp = new ListNode(0,head);
        ListNode res = temp;
        while(head.next!=null){
            temp = temp.next;
            head = head.next;
            while(temp.val==head.val){
                head = head.next;
                if(head==null){
                    temp.next = head;
                    return res.next;
                }
            }
            temp.next = head;
        }
        return res.next;
    }
}

