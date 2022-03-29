public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int x = 0;
        int carry = 0; // 上个位置相加的进位
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            x = sum % 10;
            if (head == null) {
                head = tail = new ListNode(x);                    
            } else {
                tail.next = new ListNode(x);
                tail = tail.next;
            }
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null && l2 == null) {
            if (carry > 0) {
                tail.next = new ListNode(carry);
                tail = tail.next;
            }
        } else {
            while (l1 != null) {
                int sum = l1.val + carry;
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
                carry = sum / 10;
                l1 = l1.next;
            }
            while (l2 != null) {
                int sum = l2.val + carry;            
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
                carry = sum / 10;
                l2 = l2.next;
            }
            if (carry > 0) {
                tail.next = new ListNode(carry);
                tail = tail.next;
            }
        }        
        
        return head;
    }

