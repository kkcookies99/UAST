class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        //定义一个头节点和一个尾节点
        ListNode head = null;
        ListNode tail = null;
        //定义一个表示仅为的变量
        int carry  = 0;
        //判断l1和l2是否为空，若有一个不为空，则继续进行
        while(l1!=null || l2!=null){
            //将l1和l2中的变量赋值给n1和n2(条件，l1和l2不为空，若为空则赋值为0)
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            //定义一个sum用来存储n1+n2+carry的值
            int sum = n1 + n2 + carry;
            //若没有头节点，则创建一个新的节点
            if(head == null){
                head = tail = new ListNode(sum%10);//头指针和尾指针重叠,数据域为sum%10  取余
            }else{//若已存在头节点（一个含有头节点的链表）
                tail.next = new ListNode(sum%10);//新建一个末尾结点
                tail = tail.next;//将尾部节点指向新建的节点
            }
            //计算是否有进位
            carry = sum / 10;//取整
            //无论是否有进位，则继续上面的操作，
            //需要我们将l1 l2的指针向后移动一位，这样才能取到l1 l2后面的值
            if(l1 != null){
               l1 = l1.next; 
            }
            if(l2 != null){
                l2 = l2.next;
            }

        }
        //这里需要注意，若是相同位数的两个数进行相加，则需要考虑进位,
        //上面的程序只能处理不同位数相加或者是相同位数相加而没有进位的情况
        if(carry > 0){
            tail.next = new ListNode(carry);
        }
        return head;
    }
}

