class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if head == None : return head
        have = set()
        have.add(head.val)
        q = head
        while q and q.next and q.next:
            if q.next.val in have : q.next = q.next.next
            # 删除下一个结点，直到下一个结点符合条件
            else : 
                have.add(q.next.val)
                q  = q.next
                # 移动到下一个结点
        return head

