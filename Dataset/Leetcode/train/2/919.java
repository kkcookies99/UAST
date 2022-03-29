 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {

        ListNode list = new ListNode(0);
        ListNode p = list;
        int ch = 0;
        int temp = 0;
        while(l2 != null || l1 != null){
            if(l2 == null && l1 != null){
               temp = l1.val; 
                l1 = l1.next;
            }else if(l2 != null && l1 == null){
               temp = l2.val;
                l2 = l2.next;
            }else{
                temp = l1.val+l2.val;
                l2 = l2.next;
                l1 = l1.next;
            }
            temp += ch;
            p.next = new ListNode(temp % 10);
            ch = temp / 10;
            p = p.next;
        }
        if(ch != 0){
            p.next = new ListNode(ch);
            p = p.next;
        }
        p = null;
        list = list.next;
        return list;
    }
}

