class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode temp = result;
        int carry = 0;
        while((l1 != null || l2 != null ) || carry != 0){
            int add1 = 0;
            int add2 = 0;
            if(l1 != null)add1 = l1.val;
            if(l2 != null)add2 = l2.val;
            if(add1 + add2 + carry < 10){
                temp.val = add1 + add2 + carry;
                carry = 0;
            }
            else {
                temp.val = add1 + add2 + carry - 10;
                carry = 1;
            }
            if(l1 != null)l1 = l1.next;
            if(l2 != null)l2 = l2.next;
            if((l1 != null || l2 != null ) || carry != 0){
                ListNode newnode = new ListNode();
                temp.next = newnode;
                temp = newnode;
            } 
        }
        return result;
    }
}

