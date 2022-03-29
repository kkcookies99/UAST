 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
         ListNode listNode = null;
        if (l1!=null&&l2!=null){
            int val = l1.val+ l2.val;
            if (val>9){
                if (l1.next!=null){
                    l1.next.val++;
                    listNode = new ListNode(val-10, XXX(l1.next,l2.next));
                }else {
                    listNode = new ListNode(val-10, XXX(new ListNode(1),l2.next));
                }
            }else {
                listNode = new ListNode(val, XXX(l1.next,l2.next));
            }
        }else {
            if (l1!=null){
                if (l1.val>9){
                    if (l1.next!=null){
                        l1.next.val++;
                        listNode = new ListNode(l1.val-10, XXX(l1.next,null));
                    }else {
                        listNode = new ListNode(l1.val-10, new ListNode(1));
                    }
                }else {
                    listNode = new ListNode(l1.val, l1.next);
                }
            }
            if (l2!=null){
                if (l2.val>9){
                    if (l2.next!=null){
                        l2.next.val++;
                        listNode = new ListNode(l2.val-10, XXX(null,l2.next));
                    }else {
                        listNode = new ListNode(l2.val-10,new ListNode(1));
                    }
                }else {
                    listNode = new ListNode(l2.val, l2.next);
                }
            }
        }
        return listNode;
    }
}

