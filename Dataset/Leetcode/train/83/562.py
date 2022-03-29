 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if not head:
            return None
        root = head
        pre = head
        head = head.next
        while head:
            if head.val == pre.val:
                head = head.next
                pre.next = head
            else:
                pre = pre.next
                head = head.next
        return root

