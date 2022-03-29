 public ListNode XXX(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        //如果是重复节点
        if(head.next.val == head.val) {
            ListNode node = head.next;
            ListNode pre = node;//记录node的前一个节点，即保留重复节点
            while(node.next != null && node.val == head.val) {  //寻找第一个不重复的节点node
                pre = node;
                node = node.next;
            }
            return XXX(pre);
        } else {//不是重复节点，从该节点的下一个节点开始递归
            head.next = XXX(head.next);
            return head;
        }
        
        
    }

