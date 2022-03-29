 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head == null){
            return null;
        }
        ListNode list = head;
        int len = 0;
        int i = 0;
        while(list != null){
            len++;
            list = list.next;
        }

        list = head;
        while(list != null){
            if(len - n == 0){
                head = head.next;
                return head;
            }
            if(++i == len - n){
                list.next = list.next.next;
            }
            list = list.next;
        }
        return head;
    }
}

