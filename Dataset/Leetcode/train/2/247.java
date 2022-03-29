class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();

        int temp = l1.val + l2.val;
        int nextVal = 0;

        if(temp >= 10){
            nextVal = 1;
        }
        root.val = temp % 10;
        ListNode t1 = l1.next;
        ListNode t2 = l2.next;

        ListNode node = root;
        while(t1 != null || t2 != null || nextVal == 1){   

            if(t1 != null && t2 != null) {
                temp = t1.val + t2.val + nextVal;

                if(temp >= 10){
                    nextVal = 1;
                }else{
                    nextVal = 0;
                }
                
                node.next = new ListNode(temp % 10);
                 
                node = node.next;
                t1 = t1.next;
                t2 = t2.next;
                continue;
            }

            if(t1 != null){
                temp = t1.val + nextVal;

                if(temp >= 10){
                    nextVal = 1;
                }else{
                    nextVal = 0;
                }

                node.next = new ListNode(temp % 10);
                
                node = node.next;
                t1 = t1.next;
                continue;
            }

            if(t2 != null){
                temp = t2.val + nextVal;

                if(temp >= 10){
                    nextVal = 1;
                }else{
                    nextVal = 0;
                }

                node.next = new ListNode(temp % 10);

                node = node.next;
                t2 = t2.next;
                continue;
            }

            if(t1 == null && t2 == null && nextVal == 1){
                node.next = new ListNode(nextVal);
                nextVal = 0;
                node = node.next;
                continue;
            }
        }

        return root;
    }
}

