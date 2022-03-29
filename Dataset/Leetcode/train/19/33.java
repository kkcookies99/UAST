 class Solution {
    //双节点 时间N 空间1
    public ListNode XXX(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;
        //快指针前进N步
        while(n-- > 0){
            p2 = p2.next;
        }
        //判断倒数第n个节点是不是头结点
        if(p2 == null){
            return head.next;
        }
        //判断倒数第n个节点不是头结点，找到倒数第n个节点的前一个节点
        while(p2.next != null){
            p2 = p2.next;
            p1 = p1.next;
        }
        //删除倒数第n个节点
        ListNode temp = (p1.next).next;
        p1.next = temp;
        return head;
    }
}


