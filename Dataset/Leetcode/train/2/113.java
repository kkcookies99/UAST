class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {

        ListNode a = l1;
        ListNode b = l2;
        ListNode head =new ListNode(-1);
        ListNode temp = head;
        int carry = 0;
        int pos = 0;
        while(a!=null&&b!=null){
            pos = (carry+a.val+b.val)%10;
            temp.next = new ListNode(pos);
            temp = temp.next;
            carry = (carry+a.val+b.val)/10;
            a = a.next;
            b = b.next;
        }
        while(a!=null){
            pos = (carry+a.val)%10;
            temp.next = new ListNode(pos);
            temp = temp.next;
            carry = (carry+a.val)/10;
            a = a.next;
        }
        while(b!=null){
            pos = (carry+b.val)%10;
            temp.next = new ListNode(pos);
            temp = temp.next;
            carry = (carry+b.val)/10;
            b = b.next;
        }
        if(carry>=1) temp.next = new ListNode(1);
        return head.next;
    }
}

