 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head==null ){
            return null;
        }

        int len = 1;
        ListNode node = head;
        while(node.next!=null){
            len++;
            node = node.next;
        }
        node = head;
        if( len==n ){
            head = head.next;
            node.next=null;

        }
        else {
            for (int i = 0; i < len - n - 1; i++) {
                node = node.next;
            }
            ListNode temp = node.next.next;
            node.next.next = null;
            node.next = temp;
        }
        return head;
    }
}