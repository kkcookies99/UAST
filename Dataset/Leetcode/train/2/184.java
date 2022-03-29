public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode tailNode = null;
        int sum = 0;
        int preAdd = 0;
        
        while(true){
            if(l1 == null && l2 == null && preAdd == 0){
                return result;
            }
            if( l1 == null && l2 == null){
                tailNode.next = new ListNode(preAdd);
                return result; 
            }else if(l2 == null){
                int temp = l1.val + preAdd;
                sum = temp % 10;
                preAdd = temp / 10;
                l1 = l1.next;
            }else if(l1 == null){
                int temp = l2.val + preAdd;
                sum = temp % 10;
                preAdd = temp / 10;
                l2 = l2.next;
            }else{
                int temp = l1.val + l2.val + preAdd;
                sum = temp % 10;
                preAdd = temp / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
            if(result == null){
                result = new ListNode(sum);
                tailNode = result;
            }else{
                tailNode.next = new ListNode(sum);
                tailNode = tailNode.next;
            }
        }
    }

