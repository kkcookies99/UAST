 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if (head.next == null && n == 1) {
            return null;
        }

        //转为list
        List<Integer> sets = new ArrayList<>();
        while (head != null) {
            sets.add(head.val);
            head = head.next;
        }

        //重建链表(忽略待删除结点)
        int k = 0;
        head = new ListNode();
        ListNode other = head;
        for (Integer set : sets) {
            if (k != (sets.size() - n)) {
                other.next = new ListNode(set);
                other = other.next;
            }

            k++;
        }

        return head.next;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

