 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        res = head
        while head:
            while head.next!=None and head.val == head.next.val:
                head.next = head.next.next
            head = head.next
        return res

