 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(), node = root;
        int next = 0;
        while(l1 != null || l2 != null || next != 0){
            int tmp = 0;
            if(l1 != null){
                tmp += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                tmp += l2.val;
                l2 = l2.next;
            }

            tmp += next;
            if(tmp >9){
                next = 1;
                tmp -= 10;
            }else{
                next = 0;
            }
            node.next = new ListNode(tmp);
            node = node.next;
        }
        return root.next;
    }
}

