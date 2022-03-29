class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(0);
            addNumber(l1, l2, result);
            return result;
    }
    private void addNumber(ListNode l1, ListNode l2, ListNode result) {
            if (l1==null){
                l1=new ListNode(0);
            }
            if (l2==null){
                l2=new ListNode(0);
            }
            int num = l1.val + l2.val+result.val;
            int remainder = num % 10;
            result.val = remainder;
            int itensNumber = num / 10;
            if (l1.next != null||l2.next != null||itensNumber>0) {
                ListNode nextListNode = new ListNode(itensNumber);
                result.next = nextListNode;
                addNumber(l1.next, l2.next, result.next);
            }
        }
}

