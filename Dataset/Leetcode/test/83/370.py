class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if head == None or head.next ==None:
            return head
        result = head
        res = head
        while res and res.next:
            if res.val == res.next.val:
                res.next = res.next.next
            else:
                res = res.next
        return result

