  public ListNode XXX(ListNode head, int n) {
    ListNode H=new ListNode(0);
    H.next=head;
    //生成一个结点H,q指向p后的第n个结点再同步移动到链尾，再删除p即可，
    //当p==q时，p和q移动到倒数第一个。所以初始化q指向p的前一个再移动n个结点就是倒数第n个结点;
    ListNode pre=H,p=head,q=H;

    //q先移动到n个结点
    while(n>0){
        q=q.next;
        n--;
    }

    //p-q 共n个结点，当q指向最后一个结点时，p指向倒数第n个结点，删除p即可。
    while(q.next!=null){
        pre=p;
        p=p.next;
        q=q.next;
    }

    pre.next=p.next;
    return H.next;
    }


