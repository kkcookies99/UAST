class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        //虚拟节点
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        //进位符
        int carry = 0;
        //只要两个链表有一个不为空就继续循环
        while(p != null || q != null){
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;
            int sum = carry + x + y;
            //重新计算进位
            carry = sum / 10; 
            //注意取模运算得到本位数值
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        
        //循环结算，考虑还有最后一次进位的情况
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        //虚拟节点的下一节点为最终结果
        return dummyHead.next;
    }
} 