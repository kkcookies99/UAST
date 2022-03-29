class Solution {
    public ListNode XXX(ListNode head) {
        ListNode tempNode = head;
        while(tempNode!=null && tempNode.next!=null){
            int tempVal = tempNode.val;
            ListNode tempAfter = tempNode.next;
            if(tempAfter.val == tempVal){
                while(tempAfter!=null && tempAfter.val == tempVal){
                    tempAfter = tempAfter.next;
                }
                tempNode.next = tempAfter;
                tempNode = tempAfter;
            }else{
                tempNode = tempNode.next;
            }
        }
        return head;
    }
}

