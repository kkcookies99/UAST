class Solution {
    ListNode res;
    //返回最长的列表
    public ListNode dealLongList(int mod, ListNode head, ListNode curList) {
        int tmpVal = 0;
        while (mod != 0) {
            tmpVal = (curList.val + mod) % 10;
            mod = (curList.val + mod) / 10;
            curList.val = tmpVal;
            if (curList.next == null && mod != 0) {//终止条件
                curList.next = new ListNode(mod);
                return head;
            }
            curList = curList.next;
        }
        return head;
    }

    public ListNode add(ListNode l1, ListNode l2, ListNode head1, ListNode head2, int mod) {
        int tmpVal;
        if (l1 != null && l2 != null) {
            tmpVal = (l1.val + l2.val + mod) % 10;
            mod = (l1.val + l2.val + mod) / 10;
            l1.val = tmpVal;
            l2.val = tmpVal;
            //两个列表等长的情景,访问到了最后
            if (l2.next == null && l1.next == null) {
                if (mod == 0) {
                    return head2;
                } else {
                    l2.next = new ListNode(mod);
                    return head2;
                }
            } else {
                res = add(l1.next, l2.next, head1, head2, mod); //记录需要返回的内容
            }
        } else if (l1 == null) {
            return dealLongList(mod, head2, l2);
        } else {
            return dealLongList(mod, head1, l1);
        }
        return res;
    }

    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        return add(l1, l2, head1, head2, 0);
    }
}

