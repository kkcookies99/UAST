 class Solution {
    public ListNode XXX(ListNode head) {
        ListNode pre = null;
        ListNode node = head;
        while(node != null){
            if(pre != null && pre.val == node.val)
                pre.next = node.next;//遇到相等的就跳过连到下一个
            else
                pre = node;//不相等的就直接通过
            
            node = node.next;
        }
        return head;
    }
}

