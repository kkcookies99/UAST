 class Solution {
    /**
     * 类似一个滑动窗口
     */
    public ListNode XXX(ListNode head, int n) {
        int i = n + 1;
        ListNode beforeNode = head;
        ListNode it = head;
        while(it!=null){
            if(i==0){
               beforeNode = beforeNode.next; 
            }
            if(i!=0){
                i--;   
            }
            it = it.next;
            
        }
        // 移除头结点
        if(i!=0){
            return head.next;
        }
        ListNode deleteNode = beforeNode.next;
        // 移除尾结点
        if(beforeNode.next==null){
           return null;
        }
        // 删除目标结点
        beforeNode.next = beforeNode.next.next;
        deleteNode=null;
        return head;
    }
}

