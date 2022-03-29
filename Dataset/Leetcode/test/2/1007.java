 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode node = head;
        int flag = 0, sum = 0;
        while(l1 != null || l2 != null){
            int val1= l1==null?0:l1.val;
            int val2 = l2==null?0:l2.val;
            sum = val1 + val2 +flag;
            if(sum >= 10){
                flag = 1;
                sum %= 10;
            }else{
                flag =0;
            }
            node.next = new ListNode(sum);
            l1 = l1==null?null:l1.next;
            l2 = l2==null?null:l2.next;
            node = node.next;
        }
        if(flag == 1){
            node.next = new ListNode(1);
        }
        return head.next;
    }
}

