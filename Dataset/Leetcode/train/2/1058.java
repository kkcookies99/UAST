 public class Solution {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
         ListNode r = new ListNode(0);
            int step = 0;
            Add(r, l1, l2,ref step);
            return r;
    }
     private void Add(ListNode r, ListNode l1, ListNode l2,ref int step)
        {

             int sum = l1.val + l2.val+step;

            if (sum > 9)
            {

                r.val = sum - 10 ;

                step = 1;

            }
            else
            {
                r.val = sum ;
                step = 0;
            }
           
            if (l1.next ==null&&l2.next!=null)
            {
                l1.next = new ListNode(0);
            }
            if (l1.next!=null&&l2.next==null)
            {
                l2.next = new ListNode(0);

            }
            if (l1.next == null && l2.next == null)
            {
                if (l1.val + l2.val+step > 9)
                {

                    r.next = new ListNode(step);
                }
                return;
            }
            r.next = new ListNode(0);
            Add(r.next, l1.next, l2.next,ref step);
        }
}

