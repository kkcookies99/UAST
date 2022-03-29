class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        res = ListNode(None)
        node = res
        node.next = head
        while head and head.next != None:
            if head.val == head.next.val:
                head.next = head.next.next
            else:
                node.next = head
                head, node = head.next, node.next
        return res.next

