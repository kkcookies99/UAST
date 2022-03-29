   public ListNode XXX(ListNode head, int n) {
        if (head == null){
            return null;
        }
        //手动添加一个置顶的node，其next指向传入的head
        ListNode zero = new ListNode(0);
        zero.next = head;
        //pre、next是工具节点，用于协助遍历
        ListNode pre = head;
        ListNode next = null;
        //len用于遍历链找出总长度
        int len = 0;
        while(pre != null){
            len++;
            pre = pre.next;
        }
        //从置顶的zero节点开始遍历，准备删除节点
        pre = zero;
        //遍历找到需要删除的节点的前一个节点
        //要删除倒数第n个节点，那么其前边就有len - n个节点，从置顶的zero节点开始循环 len - n  次找到要删除的节点的前一个节点
        for (int i = 1; i <= len - n ; i++) {
            pre = pre.next;
        }
        //next指向要删除的节点的下一个节点,
        next = pre.next.next;
        //将要  删除的节点的前一个节点   的next指向     要删除的节点的下一个节点
        pre.next = next;
        return zero.next;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


