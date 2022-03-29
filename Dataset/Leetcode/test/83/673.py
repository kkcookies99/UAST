 class Solution(object):
    def XXX(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head == None:
            return None
        p,r= head.next,head
        val = head.val
        while p:
            if val == p.val:
                temp = p
                p = p.next
                r.next = p 
            else:
                val = p.val
                p = p.next
                r = r.next
        return head

