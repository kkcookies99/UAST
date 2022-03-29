 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head.next ==null) return null;
        ListNode node1 = head;
        ListNode node2 = head;

        while(n>0){
            n--;
            node1 = node1.next;
        }
        //加入node1已经在NULL的情况
        if(node1 == null){
            return head.next;
        }

        while(node1.next != null){    
            node1 = node1.next;   
            node2 = node2.next;
        }

        node2.next = node2.next.next;

        return head;
    }
}

