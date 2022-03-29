 public ListNode XXX(ListNode head, int n) {
        // 移动指针
        ListNode move = head;
        // 存储链表节点(最多30个)
        ListNode[] node = new ListNode[30];
        int index = 0;
        while(move != null){
            node[index++] = move;
            move = move.next;
        }
        // 防止index-n-1小于0(删除节点为第一个节点的情况)
        if(index == n){
            return head.next;
        }
        // 删除倒数第n个节点
        node[index-n-1].next = node[index-n].next;
        return head;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

