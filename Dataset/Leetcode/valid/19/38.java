     public ListNode XXX(ListNode head, int n) {
        ListNode delNode = head;
        ListNode retNode = head;
        while (head.next != null) {
            if(n <= 0) delNode = delNode.next;
            head = head.next;
            n--;
        }
        if(n == 1) return retNode.next;
        delNode.next = delNode.next.next;
        return retNode;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

