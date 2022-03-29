 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode root=new ListNode(0,head);
        ListNode l=root,r=root;
        int cnt=0;
//r指针先遍历到最后一个结点（cnt）
        while(r.next!=null) {
            r=r.next;
            cnt++;
        }
//然后l指针指向第cnt-i-1个结点,就是所求的倒数第i个结点的前一个结点
        for(int i=0;i<cnt-n;i++) l=l.next;
        l.next=l.next.next;
        return root.next;
    }
}

