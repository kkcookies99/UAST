class Solution {
    public ListNode XXX(ListNode head) {
        boolean[] nums_list = new boolean[201];
        ListNode new_head = head;   // 头节点一定不会被删除
        ListNode last = null;   // 后退指针,与当前头节点保持一只，头节点后移前更新
        while (head != null){
            if (!nums_list[head.val+100]) {    // 不在哈希表，可以添加
                nums_list[head.val+100] = true;
                last = head;
                head = head.next;
            }
            else if (head.next != null){    // 哈希表中已经有了该值，且链表还有下一个节点
                last.next = last.next.next;     // 跨越重复节点
                head = last.next;
            }else {
                last.next = null;  //这是最后一个节点，且是重复值
                break;
            } 
        }
        return new_head;
    }
}


