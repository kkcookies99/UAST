public ListNode XXX2(ListNode l1, ListNode l2) {

    ListNode head=new ListNode(0);

    ListNode temp = head;

    ListNode temp1 = l1;

    ListNode temp2 = l2;

    int a=0;

    while (true) {

        if (null==temp1&&null==temp2){

            if (a!=0){

                temp.next=new ListNode(a);

            }

            break;

        }

        if (null != temp2 && null == temp1) {

            int c=temp2.val+a;

            a=0;

            if (c >= 10) {

                c=c%10;

                a++;

            }

            temp.next=new ListNode(c);

        }

        if (null != temp1 && null == temp2) {

            int c=temp1.val+a;

            a=0;

            if (c >= 10) {

                c=c%10;

                a++;

            }

            temp.next=new ListNode(c);

        }

        if (null != temp1 && null != temp2){

            int c = temp1.val + temp2.val + a;

            a=0;

            if (c >= 10) {

                c=c%10;

                a++;

            }

            temp.next=new ListNode(c);

        }


        if (null != temp1){

            temp1 = temp1.next;

        }
        if (null != temp2) {

            temp2 = temp2.next;

        }

        temp=temp.next;

    }

    return head.next;

}

