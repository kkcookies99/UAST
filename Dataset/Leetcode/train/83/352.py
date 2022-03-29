class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if head == None:
            return None
        val = head.val
        res = head
        while head.next != None:
            if head.next.val == val:
                head.next = head.next.next
            else:
                head = head.next
                val = head.val
        return res

