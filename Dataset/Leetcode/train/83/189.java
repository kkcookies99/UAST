class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head.next;
        ListNode pre = head;
        int n = 0;
        while(cur != null){
            if (pre.val != cur.val){
                pre = pre.next;
                n++;
                pre.val = cur.val;
            }
            cur = cur.next;
        }
        ListNode node = head;
        for(int i = 0;i <= n;i++){
            if (i == n) {
                node.next = null;
            }else {
                node = node.next;
            }
        }
        return head;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


