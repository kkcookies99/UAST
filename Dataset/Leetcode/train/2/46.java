    class Solution {
        
        public ListNode XXX(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(-1);
            ListNode p = dummy;
            help(l1, l2, p);
            return dummy.next;
        }

        private void help(ListNode l1, ListNode l2, ListNode p) {
            int preVal = 0;
            while (l1 != null && l2 != null) {
                int sum = l1.val + l2.val + preVal;
                preVal = sum / 10;
                int val = sum % 10;
                ListNode node = new ListNode(val);
                p.next = node;
                p = node;
                l1 = l1.next;
                l2 = l2.next;
            }
            //preVal==0说明无需进位，l1和l2哪个不为null，只需链接哪个
            if (preVal == 0) {
                p.next = l1 == null ? l2 : l1;
                return;
            }
            //说明l1和l2是相同位数只需进一位
            if (l1 == null && l2 == null) {
                p.next = new ListNode(preVal);
                return;
            }
            //l1和l2不是相同位数，而且还存在进位；将preVal作为一个结点，递归调用
            ListNode n1 = l1 == null ? l2 : l1;
            ListNode n2 = new ListNode(preVal);
            help(n1, n2, p);
        }
    }

