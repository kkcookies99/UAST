class Solution(object):
    def XXX(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head or not head.next:
            return head
        
        p = head
        while p and p.val == head.val:
            p = p.next
        head.next = self.XXX(p)
            
        return head

