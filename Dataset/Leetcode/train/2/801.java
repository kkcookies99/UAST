     class Solution {
        public ListNode XXX(ListNode l1, ListNode l2) {
            ListNode l3 = new ListNode(0);
            int result=0;
            int i=0;
            ListNode p1=l1;
            ListNode p2=l2;
            ListNode p3=l3;
            while (p1 != null && p2 != null) {
                int x = (int)Math.pow(10,i);
                result = (p1.val + p2.val)*x+result;
                p1 = p1.next;
                p2 =p2.next;
                i+=1;
            }
            while (p1!= null){
                int x = (int)Math.pow(10,i);
                result = result+p1.val*x;
                p1 = p1.next;
                i+=1;
            }
            while (p2!= null){
                int x = (int)Math.pow(10,i);
                result = result+p2.val*x;
                p2 =p2.next;
                i+=1;
            }

            l3.val = result%10;
            result = result/10;
            while(result!=0){
                ListNode node = new ListNode(0);
                node.val=result%10;
                p3.next =node;
                p3=node;
                result=result/10;
            }
            return l3;
        }
    }

