class Solution {
    //双指针
    public ListNode XXX(ListNode head) {
        if(head == null)return head;
        //指针2等于指针1的next值
        ListNode fist = head,last = head.next;
        while (last!=null){
            //判断指针1是否等于指针2
            if(fist.val != last.val){
                //两个指针不相等，指针1向后移位
                fist = last;
            }else{
                //两个指针相等，指针1的next值跳过指针2
                fist.next = last.next;
            }
            //指针2向后移位
            last = last.next;
        }
        //上述操作都是操作ListNode的内存地址，结果直接影响head变量
        return head;
    }
}

