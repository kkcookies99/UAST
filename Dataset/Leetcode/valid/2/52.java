class Solution {

        public ListNode XXX(ListNode l1, ListNode l2) {
            if (l1 == null && l2  == null ) return null;
            if(l1 == null) l1 = new ListNode(0);
            if (l2 == null) l2 = new ListNode(0);
            int num1 = l1.val;
            int num2 = l2.val;
            int sum = num1 + num2;
            int carry = sum / 10;
            sum = sum % 10;
            ListNode next = XXX(l1.next,l2.next);
            ListNode res = new ListNode(sum,next);
            if (carry == 1) {
                res.next = XXX(res.next,new ListNode(1));
            }
            return res;
        }
    }

