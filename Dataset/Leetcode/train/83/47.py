class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        ans = head
        while head != None:
            if head.next != None and head.next.val == head.val:
                head.next = head.next.next
            else:
                head = head.next
        return ans

