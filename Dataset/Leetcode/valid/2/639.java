     public ListNode XXX(ListNode l1, ListNode l2) {

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        ListNode node1 = l1;
        ListNode node2 = l2;

        while (node1 != null){
            queue.offer(node1.val);
            node1 = node1.next;
        }

        while (node2 != null){
            queue2.offer(node2.val);
            node2 = node2.next;
        }
        ListNode head = new ListNode(-1) ;
        ListNode yummyNode = head;

        int carry = 0;
        while (!queue.isEmpty() || !queue2.isEmpty()){
            int sum = (queue.isEmpty()?0:queue.poll()) + (queue2.isEmpty()?0:queue2.poll());
           
            int temp = sum%10 + carry;
            yummyNode.next = new ListNode(temp >= 10 ? (temp - 10) : temp);
            if(sum+carry >= 10){
                carry = 1;
            }else{
                carry = 0;
            }
            yummyNode = yummyNode.next;
        }
        if(carry == 1){
            yummyNode.next = new ListNode(1);
        }
        return head.next;
    }

