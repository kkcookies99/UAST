     public ListNode XXX(ListNode head, int n) {
        //处理链表的临时变量
        ListNode temp = head;
        //记录链长
        int length = 1;
        while(temp.next != null){
            length++;
            temp = temp.next;
        }
        temp = head;
        //处理移除操作
        for(int i = 0;i < length - n + 1;i++){
            //如果是第一个，直接更改退出
            if(length - n + 1 == 1){
                head = head.next;
                break;
            }
            //如果到达待修改的前节点，进行修改
            if(i == length - n - 1){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

