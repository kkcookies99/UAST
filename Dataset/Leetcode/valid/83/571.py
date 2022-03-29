 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if head == None or head.next== None:  # 考虑空链表或者有头空链表
            return head        
        p = head        # 定义一个指针，指向头结点
        while True:
            if p.val == p.next.val:     # 找到重复结点元素
                p.next = p.next.next    # 直接改变指向，删除该元素
            else:
                p = p.next              # 否则继续往后遍历
            if p.next==None:            # 遍历到链表尾部停止
                break         
        return head                     # 返回链表头结点

