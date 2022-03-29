 public ListNode XXX(ListNode head, int n) {
        ListNode cur=head;
        ListNode first=new ListNode(-1,cur);//设置假的头节点
        ListNode pre=first;
        int i=1;
        while (cur!=null){
            if (i>=n) {//快指针走了n步后满指针走
                if (cur.next==null){//快指针要走完了，该删除节点了
                    pre.next=pre.next.next;
                }
                pre=pre.next;
            }
            i++;
            cur=cur.next;
        }
        return first.next;
    }

