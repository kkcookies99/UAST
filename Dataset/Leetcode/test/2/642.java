 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        int x = 0;
        ListNode tempNode =  new ListNode(-1);
        ListNode result = tempNode;
        while(true){
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            if( l1 == null && l2 == null){
                if(x == 1){
                    tempNode.next = new ListNode(1);
                }
                return result.next;
            }
            int sum = val1+val2+x;
            if (sum >=10){
                x = 1;
                sum-=10;
            }
            else{
                x = 0;
            }
            tempNode.next = new ListNode(sum);
            tempNode = tempNode.next;
            l1 = l1 == null ? l1 :  l1.next;
            l2 = l2 == null ? l2 :  l2.next;
        }
    }
}

