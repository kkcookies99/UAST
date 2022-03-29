class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode temp = head;       //  扫描指针
        ListNode nextNode = temp.next;  
        while(true){
            if (nextNode == null){
                temp.next = null;
                break;
            }else if (temp.val != nextNode.val){
                temp.next = nextNode;
                temp = nextNode;
                nextNode = nextNode.next;
            }else {
                nextNode = nextNode.next;       //  后移
            }
        }
        return head;
    }
}

