 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        ListNode t = head;
        while(l1 != null || l2 != null){
            p.next = new ListNode(0);
            p = p.next;
            if(l1 == null){
                p.val = l2.val;
                l2 = l2.next;
            }else if (l2 == null){
                p.val = l1.val;
                l1 = l1.next;
            }else {
                p.val = l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        while(t != null){
            if(t.val > 9){
                t.val = t.val % 10;
                if(t.next != null){
                    t.next.val++;
                }else{
                    t.next = new ListNode(1);
                }
            }
            t = t.next;
        }
        return head.next;
        
    }
}

