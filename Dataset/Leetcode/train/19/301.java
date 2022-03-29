 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode p = head;  //快
        ListNode q = p;     //慢
        //让快指针先跑n
        for(int i = 0;i < n;i++){
            p = p.next;
        }
        //p跑完了，开始一起跑
        if(p == null)  //不用跑了，要删的就是第一个元素
            return head.next;
        while (p.next != null){
            p = p.next;
            q = q.next;
        }
        p = q.next.next;
        q.next.next = null;
        q.next = p;
        return head;
    }
}

