ListNode result = new ListNode();
        // 保留初始的链表的地址
        ListNode node = result;
        while(a != null || b!=null){
            int sum = result.val;
            if (a!=null){
                sum += a.val;
            }
            if (b!= null){
                sum+= b.val;
            }
            result.val = sum;
            ListNode temp = new ListNode();
            if (sum>=10){
                result.val = result.val-10;
                // 这是下个节点需要加的值
                temp.val = 1;
            }
            if (a != null) a=a.next;
            if (b!=null) b = b.next;
            // 如果进一位为0 ，且没有更多的结果了可以直接终止了，不然会多出一个0
            if (a==null && b==null && temp.val==0)
                break;
            result.next = temp;
            result = result.next;
        }
        return node;

