 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        
        ListNode root = l1, p = l1, pp = p, q = l2;
        int pre = 0;
        while (p!=null && q != null){
            int t = p.val + q.val + pre;
            p.val = t %10;
            pre = t / 10;
            pp = p;
            p = p.next;
            q = q.next;
        }

        while(p!=null){
            int t = pre + p.val;
            p.val = t % 10;
            pre = t / 10;
            pp = p;
            p = p.next;
        }
        if(q!=null){
            pp.next = q;
        }
        while(q!=null){
            int t = pre + q.val;
            pre = t /10;
            q.val = t % 10;
            pp = q;
            q = q.next;   
        }
        if(pre!=0){
            ListNode node = new ListNode(pre);
            pp.next = node;
        }
        return root;
    }
}

