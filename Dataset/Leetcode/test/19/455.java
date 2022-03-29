 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode slowNode = head;
        int slowIndex = 0;
        ListNode fastNode = head;
        int fastIndex = 0;
        
        while(fastIndex-slowIndex!=n && fastNode.next!=null){
            fastNode = fastNode.next;
            fastIndex++;
        }

        while(fastNode.next != null){
            fastNode = fastNode.next;
            fastIndex++;
            slowNode = slowNode.next;
            slowIndex++;
        }

        if(fastIndex - slowIndex != n){
            dummyHead.next = head.next;
        }else{
            slowNode.next = slowNode.next.next;
        }
        return dummyHead.next;

    }
}

