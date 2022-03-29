 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        int len = 0;
        //第一遍遍历找链表长度
        while(pre.next != null){
            len++;
            pre = pre.next;
        }
        pre = dummyHead;
        len -= n;
        //第二遍遍历删除元素
        for(int i = 0; i < len; i++){
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return dummyHead.next;
    }
}

