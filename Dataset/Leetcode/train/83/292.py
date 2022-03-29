class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        # 空链表没有next属性
        if not head:
            return head
        cur = head        
        while cur.next:
            # 当前节点和下个节点值相同
            if cur.val == cur.next.val:
                cur.next = cur.next.next
            else:
                cur = cur.next
        return head

