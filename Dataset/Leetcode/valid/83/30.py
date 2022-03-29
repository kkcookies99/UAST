class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if head == None:
            return None

        node = head
        while node.next != None:
            if node.val == node.next.val:
                node.next = node.next.next
            else:
                node = node.next
        return head

