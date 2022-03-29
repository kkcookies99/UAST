 class Solution {
    private static int k = 0;
    public ListNode XXX(ListNode head, int n) {
        
        if (head == null){
            return null;
        }
        head.next = XXX(head.next, n);
        k ++;
        return n == k ? head.next : head; 
    }
}

