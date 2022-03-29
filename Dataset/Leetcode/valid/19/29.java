 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode indexnode = head;
        int Listlenght = 1;
        while (indexnode.next!=null){
            Listlenght++;
            indexnode = indexnode.next;
        }
        int findindex = Listlenght - n +1;

        int Listindex = 0;
        indexnode = head;
        if(Listlenght==1){
            head = null;
            return head;
        }
        if(findindex==1){
            head = head.next;
            return head;
        }
        while (indexnode.next!=null){
            if (++Listindex == findindex-1){
                indexnode.next = indexnode.next.next;
                break;
            }

            indexnode = indexnode.next;
        }
        return head;
    }
}

