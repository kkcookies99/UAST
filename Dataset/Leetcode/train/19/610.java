 public ListNode XXX(ListNode head, int n) {
        // 如果只有一个元素，直接返回null
        if (head.next == null) {
            return null;
        }
        // 快指针
        ListNode fast = head;
        // 最终指向倒数第n个节点
        ListNode temp = head;
        // 最终指向倒数第n个节点的上一个节点
        ListNode pre = null;
        // 找到倒数第n个节点
        while (fast != null) {
            fast = fast.next;
            if (n == 0) {
                pre = temp;
                temp = temp.next;
            } else {
                n--;
            }
        }

        if (pre != null) {
            // 将倒数第n个节点的上一个节点 指向 倒数第n个节点的下一个节点
            pre.next = temp != null ? temp.next : null;
        } else {
            // 如果pre为null,说明删除的是头结点
            head = head.next;
        }
        return head;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


