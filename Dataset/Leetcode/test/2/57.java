class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode tmp1 = l1, tmp2 = l2;
        int carry = 0, sum = 0;  // carry记录进位, sum和
        ListNode tmp3 = new ListNode();  
        ListNode result = tmp3;  // 结果的头节点(没有val)
        while (tmp1!=null || tmp2!=null) {
            int raw;
            if (tmp1==null) {
                raw = tmp2.val + carry;
                tmp2 = tmp2.next;
            } 
            else if (tmp2==null) {
                raw = tmp1.val + carry;
                tmp1 = tmp1.next;
            }
            else {
                raw = tmp1.val + tmp2.val + carry;
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
            }
            carry = raw / 10;
            sum = raw % 10;
            ListNode tmp4 = new ListNode(sum);
            tmp3.next = tmp4;
            tmp3 = tmp4;    
        }
        // 所有求和运算后，还得确认是否有进位
        if (carry>0) tmp3.next = new ListNode(carry);
        return result.next;  
    }
}

