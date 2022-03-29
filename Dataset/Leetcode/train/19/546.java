 public ListNode XXX(ListNode head, int n) {

        ListNode node = head;
        int index = 0;
        ListNode[] a = new ListNode[100];
        while (node != null) {
            a[index] = node;
            node = node.next;
            index++;
        }

        if (a[index - n] != null) {
            if (index - n - 1 < 0) {
                return a[index-n+1];
            } else {
                a[index - n - 1].next = a[index - n].next;
            }
        }

        return head;
    }

