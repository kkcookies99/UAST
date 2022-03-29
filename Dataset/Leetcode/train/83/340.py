class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if not head:
            return None
        res = res_dummy = ListNode(-200)
        while head:
            if head.val != res.val:
                res.next = ListNode(head.val)
                res = res.next
            head = head.next
        
        return res_dummy.next

