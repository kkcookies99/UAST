 class Solution {
    public ListNode XXX(ListNode head, int n) {
        Stack<ListNode> stack = new Stack<>();
        ListNode p = head;
        while(p != null){
            stack.push(p);
            p = p.next;
        }
        ListNode temp = null;
        for(int i = n; i > 0; i--){
            temp = stack.pop();
        }
        if(stack.isEmpty()){
            head = head.next;
        }else{
            ListNode q = stack.pop();
            q.next = temp.next;
        }
        return head;
    }
}

