 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode l3 = l1,l4 = l2, l5 = new ListNode(101);

        int flag = 0;
        while (l3 != null ||  l4 != null) {
            ListNode l6 = new ListNode();
            int num1 = 0,num2 = 0;
            if (l3 != null) {
                num1 = l3.val;
                l3 = l3.next;
            }

            if (l4 != null){
                num2 = l4.val;
                l4 = l4.next;
            }

            if (flag == 1) {
                if (flag + num1 + num2 - 10 >= 0) {
                    l6.val = flag + num1 + num2 - 10;
                    flag = 1;
                }else{
                    l6.val = flag + num1 + num2;
                    flag = 0;
                } 
            }else {
                if (num1 + num2 - 10 >= 0) {
                    l6.val = num1 + num2 - 10;
                    flag = 1;
                }else{
                    l6.val = num1 + num2;
                    flag = 0;
                } 

            }
            ListNode l7 = l5;
            if (l7.val == 101) {
                l7.val = l6.val;
            }else {
                while (l7.next != null){
                    l7 = l7.next;
                }
                l7.next = l6;
            }
        }

        if (flag == 1) {
            ListNode l8 = l5;
            while (l8.next != null){
                l8 = l8.next;
            }
            l8.next = new ListNode(1);
        }

        return l5;
    }
}

