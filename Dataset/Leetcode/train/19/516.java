   public ListNode XXX(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        int i = 0;
        while(fast.next != null){
            fast = fast.next;
            if (++i > n) {
                slow = slow.next;
            } 
        }
        slow.next = slow.next.next;
        return dummy.next;
  }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


