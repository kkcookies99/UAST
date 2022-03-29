     public ListNode XXX(ListNode head, int n) {
          //处理head.len = 1
          if(head.next == null) {
              return null;
          }

          ListNode p1 = head, p2 = head;
          while (n > 0) {
              p2 = p2.next;
              --n;
          }

          while (p2 != null && p2.next != null) {
              p1 = p1.next;
              p2 = p2.next;
          }
        //处理n = head.len
        if(p2 == null) {
            head = head.next;
            return head;
        }//处理n = 1
        else if(p1.next == p2) {
            p1.next = null;
            return head;
        }

        //处理n > 3
        p1.next = p1.next.next;

          return head;
    }


