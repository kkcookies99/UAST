 class Solution {
    public ListNode XXX(ListNode head, int n) {
        
        ListNode headNode = new ListNode(0);
        headNode.next = head;
        
        ListNode aimNode = head;
        ListNode lastNode = headNode;
        ListNode currentNode = head;
        
        int currentNumber = 1;
        while(currentNode!=null){
            if(currentNumber>n){
                lastNode = aimNode;
                aimNode = aimNode.next;
            }
            currentNode = currentNode.next;
            currentNumber++;
        }
        
        lastNode.next = aimNode.next;
             
        return headNode.next;
       
    }
}

