 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode result = new ListNode(0, head);
        ListNode node = head;
        ListNode prev = result;
        int left = 0, right = 0;
        while(node != null){
            //走到最后一个
            if(node.next == null){
                prev.next = prev.next.next;
            }
            if(right - left < n-1){
                right++;
            }else{
                right++;
                left++;
                prev = prev.next; 
            }
            node = node.next;
        }
        return result.next;
    }
}


