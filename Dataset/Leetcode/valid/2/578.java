 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode zero = new ListNode(0);
        ListNode result = new ListNode(0);
        ListNode temp = result;
        ListNode t = temp;// 记录次高位
        while (l1 != null || l2 != null) {
            t = temp;
            l1 = l1 != null ? l1 : zero;
            l2 = l2 != null ? l2 : zero;
            temp.next = new ListNode((temp.val + l1.val + l2.val) / 10);
            temp.val = (temp.val + l1.val + l2.val) % 10;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (t.next.val == 0) {
            t.next = null;// 删掉最高位的0
        }
        return result;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


