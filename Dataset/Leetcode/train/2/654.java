 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode l1CurNode = l1, l2CurNode = l2;
        Queue<ListNode> queue = new LinkedList<>();
        boolean flag = false;

        while (l1CurNode != null || l2CurNode != null || flag){
            int l1Val = 0, l2Val = 0;
            if (l1CurNode != null){
                l1Val = l1CurNode.val;
                l1CurNode = l1CurNode.next;
            }
            if (l2CurNode != null){
                l2Val = l2CurNode.val;
                l2CurNode = l2CurNode.next;
            }
            int val = l1Val + l2Val;

            if (flag){
                val += 1;
            }

            if (val >= 10){
                flag = true;
                val -= 10;
            }else {
                flag = false;
            }
            queue.add(new ListNode(val));
        }
        ListNode head = queue.poll(), cur = head;
        
        while (!queue.isEmpty()){
            cur.next = queue.poll();
            cur = cur.next;
        }
        return head;
    }
}

