 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        pre = ListNode(None)
        pre.next = head
        while head and head.next:
            next_node = head.next
            if head.val == next_node.val:
                head.next = next_node.next
            else:
                head = next_node
        
        return pre.next


