 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null ){
            return l1;
        }
        ListNode res = new ListNode(0);//建立新的链表,接收结果
        ListNode post = new ListNode(0);//表示前面相加是否有进位，有进位则为1
        ListNode head = res;//记录头结点
        while(l1 != null && l2 != null){
            int sum = l1.val+l2.val + post.val;
            if(sum >= 10){
                post.val = 1;
            }else{
                post.val = 0;
            }
            ListNode cur = new ListNode(sum%10);
            res.next = cur;
            res = cur;
            //更新reversel1和reversel2
            l1=l1.next;
            l2=l2.next;
        }
        if(l1 != null ){
            res.next = XXX(l1,post);
        }else if(l2 != null){
            res.next = XXX(l2,post);
        }else if(post.val == 1){
            res.next = post;
        }

        return head.next;
    }
}
//最开始的想法：遍历两个链表取出数字，转为整型，或者long，相加后，再将各个数字放进新的链表中（这种方法受限于链表不能太长，否则超出long型表示范围）

