     public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(), pre = dummy;
        int sum = 0;
        while (l1 != null || l2 != null || sum > 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            pre.next = new ListNode(sum % 10);
            sum /= 10;
            pre = pre.next;
        }
        return dummy.next;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


