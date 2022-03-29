/* java */
class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode ret=new ListNode(), cur=ret, prev=ret;

        while(l1!=null && l2!=null){
            cur.val += (l1.val+l2.val);     // 先求和
            cur.next = new ListNode(cur.val>9?1:0);    //需要进位吗;
            cur.val %= 10;
            prev = cur;
            cur = cur.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1!=null){
            cur.val += l1.val;
            cur.next = new ListNode(cur.val>9?1:0);
            cur.val %= 10;
            prev = cur;
            cur = cur.next;
            l1 = l1.next;
        }

        while(l2!=null){
            cur.val += l2.val;
            cur.next = new ListNode(cur.val>9?1:0);
            cur.val %= 10;
            prev = cur;
            cur = cur.next;
            l2 = l2.next;
        }
        // 如果l1和l2同时为null,而且cur.val==0,那么须将cur,即prev.next设为null.
        prev.next = (cur.val==0)?null:cur;

        return ret;
    }
}

