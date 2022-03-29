class Solution(object):
    def XXX(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        dummy = ListNode(0)
        p = dummy

        delta = 0
        val1 = val2 = 0
        while l1 or l2:
            if l1 and l2:
                val1, val2 = l1.val, l2.val
                l1 = l1.next
                l2 = l2.next
            elif l1 and not l2:
                val1, val2 = l1.val, 0
                l1 = l1.next
            else:
                val1, val2 = 0, l2.val
                l2 = l2.next
            
            total = val1 + val2 + delta
            p.next = ListNode(total % 10)
            p = p.next
            delta = total // 10  

        if delta == 1:
            p.next = ListNode(1)
        
        return dummy.next
            

