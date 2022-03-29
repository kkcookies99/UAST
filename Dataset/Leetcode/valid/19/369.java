 class Solution {
    public ListNode XXX(ListNode head, int n) {
        List<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while (node != null){
            list.add(node);
            node = node.next;
        }
        ListNode del = list.get(list.size() - n);
        if (list.size() - n == 0){
            head = del.next;
        }else{
            ListNode prevDel = list.get(list.size() - n - 1);
            prevDel.next = del.next;
        }
        return head;
    }
}

