public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        int num = 0;
        while(head1!=null && head2!=null){
            int temp = head1.val + head2.val + num;
            if(temp>9){
                ListNode curNode = new ListNode(temp%10);
                cur.next = curNode;
                num = 1;
            }
            else{
                ListNode curNode = new ListNode(temp);
                cur.next = curNode;
                num = 0;
            }
            head1 = head1.next;
            head2 = head2.next;
            cur = cur.next;
        }
        ListNode remainHead = null;
        if(head1!=null){
            remainHead = head1;
        }
        if(head2!=null){
            remainHead = head2;
        }

        while(remainHead!=null){
            int temp = num + remainHead.val;
            if(temp>9){
                ListNode curNode = new ListNode(temp%10);
                cur.next = curNode;
                num = 1;
            }
            else{
                ListNode curNode = new ListNode(temp);
                cur.next = curNode;
                num = 0;
            }
            remainHead = remainHead.next;
            cur = cur.next;
        }

        if(num==1){
            ListNode node = new ListNode(1);
            cur.next = node;
        }
        return dummy.next;



    }

