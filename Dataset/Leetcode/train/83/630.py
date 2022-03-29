 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if not head:
            return head
        n = head.next
        prev = head
        while True:
            if n:
                # 如果上一个节点值等于当前节点则将上一个节点的下一个节点修改为当前节点的下一个节点
                if n.val == prev.val:
                    prev.next = n.next
                else:
                    prev = n
                n = n.next
            else:
                break

        return head

