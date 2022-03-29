 public ListNode XXX(ListNode head) {
        ListNode run = null;//负责遍历序列的指针
        ListNode flag = head;//哨兵
        while(flag != null){
            run = flag.next;
            while(run != null && run.val == flag.val){
                //这个子循环中，固定flag的位置,run指针继续向后遍历
                //如果发现某节点的值和flag节点的值相同, 干掉它。
                //直至找到一个新的值或队列空了
                flag.next = run.next;
                run = flag.next;
            }
            //说明队列中没有和flag节点的值相同的节点了，flag可以向后挪动一位
            flag = flag.next;
        }
        return head;
    }

