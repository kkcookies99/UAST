     public ListNode XXX(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;
        while(curr!=null){
            length++;
            curr = curr.next;
        }
        //链表 1->2->3->4->5
        //需要删除倒数第2个，就是删除顺数第4个，需要找到顺数第3个
        //需要删除倒数第1个，就是删除顺数第5个，需要找到顺数第4个
        //需要删除倒数第2个，就是删除顺数第4个，需要找到顺数第3个
        //需要删除倒数第5个，就是删除顺数第1个，需要找到顺数第0个
        int index = length - n;
        if(index==0) {
        	return head.next;
        }
        curr = head;
        for(int i=1;i<index;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

