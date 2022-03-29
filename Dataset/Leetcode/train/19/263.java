 class Solution {
    public ListNode XXX(ListNode head, int n) {
            //当head为空，返回null
            if( head == null ){
                return null;
            }
            //计算出链表的长度
            int length = listLength(head);
            //倒数第n，算出正数要算出的位置
            int no = length - n;
            //如果要删除的链表为表头，直接返回链表后一个位置
             if(no == 0){
                return head = head.next;
            }
            ListNode temp = head;
            //遍历到要删除的位置的前一个位置
            for(int i = 0 ;i < no -1 ;i++){
                temp = temp.next;
            }
            //删除操作
            temp.next = temp.next.next;
            return head;

    }
    public int listLength(ListNode head){
            int length = 0;
            ListNode temp = head;
            while(temp != null){
                length++;
                temp = temp.next;
            }
            return length;
    }
}

