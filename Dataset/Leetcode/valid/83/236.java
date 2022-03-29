 public ListNode XXX(ListNode head) {
        if(head==null)
            return null;
        ListNode node = head;
        ListNode temp;
        while (node.next!=null){
            if(node.next.val!=node.val){
                node = node.next;
            }
            else {
                temp = node;
                // 若遇到相同的值 则一直向后寻找与上一节点不同的值
                while (temp.next!=null){
                    temp = temp.next;
                    if(temp.val!=node.val){
                        node.next = temp;
                        break;
                    }
                }
                if(temp.next==null&&temp.val==node.val) 
                    node.next = null;
            }
        }
        return head;
    }

