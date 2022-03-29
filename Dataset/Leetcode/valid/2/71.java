class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        int addNum = 0;
        while(q!=null){
            if(p.next==null && q.next!=null)
                p.next = new ListNode(0);
            if(q.next==null && p.next!=null)
                q.next = new ListNode(0);
            int sumAll = addNum + p.val + q.val;
            p.val = sumAll % 10;
            addNum = sumAll / 10;
            if(p.next == null && q.next == null && addNum!=0)
                p.next = new ListNode(addNum);
            p = p.next;
            q = q.next;
        }
        return l1;
    }
}

