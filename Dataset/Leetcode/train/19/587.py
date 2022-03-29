 class Solution(object):
    def XXX(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        if not head or not head.next:
            return None
        
        fast = slow = head
        for i in range(n):
            fast = fast.next
        
        pre = ListNode(-1)
        p = pre
        while fast:
            p.next = slow
            p = p.next
            fast = fast.next
            slow = slow.next

        p.next = slow.next
        return pre.next

