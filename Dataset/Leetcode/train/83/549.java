 class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null){
            return head;
        }
        // 定义node引用指向head
        ListNode node = head;
        ListNode next = head.next;
        while(node.next != null){
            // 如果当前a,a+1两个节点相等，则指向a+2节点
            if(node.val == next.val){
                node.next = next.next;
            // 如果不相等，则循环比较下一个节点    
            }else{
                node = node.next;
            }
            // next移一位
            next = node.next;
        }
        return head;
        
    }
}

