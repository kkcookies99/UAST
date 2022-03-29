 class Solution {
    public ListNode XXX(ListNode head, int n) {
        //虚拟头结点
        ListNode dummyhead = new ListNode(-1);
        dummyhead.next = head;
        
        //定义双指针p, q 固定两个指针之间的距离为n+1, 不断移动双子针，当q指向null时，p刚好指向待删除节点的前一个节点
        ListNode p = dummyhead;
        ListNode q = dummyhead;
        for(int i=0; i<n+1; i++){
            q = q.next;
        }
        
        while(q != null){
            p = p.next;
            q = q.next;
        }
        
        //此时，p指向待删除节点的前一个节点,删除p的后一个节点即可
        ListNode del=p.next;
        p.next = del.next;
        del.next = null;
        
        return dummyhead.next;        
    }
}

