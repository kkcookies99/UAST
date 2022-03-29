 class Solution {
    public ListNode XXX(ListNode head, int n) {
        // 初始化快慢指针
        ListNode fast = head, slow = head;
        if(fast.next == null && n >= 1) return null; 
        for(int i = 0; i <= n; i++){
            if(fast != null){
                fast = fast.next; // 快指针
            }else  return head.next;
        }
        // System.out.println(fast.val);
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

