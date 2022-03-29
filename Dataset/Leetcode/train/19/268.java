 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode index = head;
        ListNode pre = head;

        //使用这种方式的前提条件是，被删节点得有前一个节点
        while(n >= 0){
            if(index == null){
                //干头
                return head.next;
            }else{
                index = index.next;
                n--;
            }
        }
        while(index != null){
            index = index.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}

