 public ListNode XXX(ListNode head) {
        if (head == null) return null;
        ListNode p = head;
        while (p.next != null) {
            if(p.val == p.next.val) {
                if (p.next.next != null) {
                    p.next = p.next.next;
                } else {
                    p.next = null;
                }
            } else {
                p = p.next;
            }
        }
        return head;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


