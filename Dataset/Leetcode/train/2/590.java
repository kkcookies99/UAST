 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        int n1,n2;
        int s,ca;
        ca = 0;
        s = 0;
        ListNode node = null;
        ListNode pre = new ListNode(-1);
        ListNode head = pre;
        while(l1 != null || l2 !=null){
            n1 = n2 = 0;
            if(l1 != null){
                n1 =  l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                n2 = l2.val;
                l2 = l2.next;
            }
            
            s = n1 + n2 + ca;
            //进位和 和
            if((ca = s/10)==1 && (s=s-10) > 0);
                      
            node = new ListNode(s);
            pre.next = node;
            pre = node;
        }
        //处理最后有进位的情况
        if(ca == 1){
            node = new ListNode(1);
            node.next = null;
            pre.next = node;
        }
        return head.next;
    }
}

