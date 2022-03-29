class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(-1);
        ListNode ans = ret;
        boolean add = false;
        while(l1 != null || l2 != null){
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = add ? x + y + 1 : x + y;
            if(sum >= 10){
                add = true;
                sum -= 10;
            }else
                add = false;
            ListNode node = new ListNode(sum);
            ret.next = node;
            ret = ret.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if(add){
            ret.next = new ListNode(1); 
        }
        return ans.next;
    }
}

