 public ListNode XXX(ListNode head, int n) {
        if(head == null)
            return null;
        
        ListNode pPreNode = head;
        ListNode pNode = head;
        
        //前走n步，pPreNode是要删除节点的前一个节点
        int i=0;
        while(i<n){
            pNode = pNode.next;
            i++;
        }
        
        if(pNode == null){  //如果要删除的是第一个结点
            head = pPreNode.next;
            pPreNode.next = null;
        } else {
            while(pNode.next != null){
                pNode = pNode.next;
                pPreNode = pPreNode.next;
            }
            ListNode tempNode = pPreNode.next;
            pPreNode.next = tempNode.next;
            tempNode.next = null;
        }
        
        return head;
    }

