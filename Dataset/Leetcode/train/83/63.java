class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode node = head;	//使用临时指针
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
        return head;
    }
}


