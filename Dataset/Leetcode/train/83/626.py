 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        def delete(node: ListNode):
            if node and node.next:
                if node.val == node.next.val:
                    node.next = node.next.next
                    delete(node)
                else:
                    delete(node.next)

        delete(head)
        return head

