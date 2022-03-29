 class Solution {
    public ListNode XXX(ListNode head, int n) {
        Queue<ListNode> queue = new LinkedList();

        ListNode flag = head;
        int size = 0;
        //遍历一遍
        while (flag != null) {
            if (queue.size() == n + 1) 
                queue.poll();
            queue.add(flag);
            flag = flag.next;
            size++;
        }

        if(size == 1) return null;

        //poll出的是n-1个节点
        flag = queue.poll();
        if (n == 1) {
            flag.next = null;
        } else if (n == size) {
            return head.next;
        } else {
            flag.next = flag.next.next;
        }

        return head;
    }
}

