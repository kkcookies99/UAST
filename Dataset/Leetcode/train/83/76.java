    public ListNode XXX(ListNode head) {
        ListNode cur = head;// 设置一个指针指向当前结点
        while(cur!=null){
            if(cur.next==null)// 检查下一个结点是不是空结点
                break;// 如果是空结点，说明当前结点已经是尾结点，跳出判断循环
            if(cur.val==cur.next.val)// 如果当前值和下一个值相等，说明下一个结点是重复结点
                cur.next = cur.next.next;// 直接跳过该节点，jvm自动回收
            else// 当前值和下一个值不相等，检查下一个结点
                cur = cur.next;
        }
        return head;        
    }

