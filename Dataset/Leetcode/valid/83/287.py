class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        node = head
        while node and node.next:
            if node.val != node.next.val:
                node = node.next
            else:
                node.next = node.next.next
        return head

