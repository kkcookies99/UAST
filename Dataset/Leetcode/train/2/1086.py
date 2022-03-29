 class Solution(object):
    def XXX(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        r = ListNode(0)   
        r.val = self.cal_next(0, l1, l2, r)
        return r

    def cal_next(self, up_val, l1, l2, r):    
        val1 = l1.val if l1 else 0
        val2 = l2.val if l2 else 0    
        l1_next = l1.next if l1 else None
        l2_next = l2.next if l2 else None            
        r.val = (val1 + val2 + up_val) % 10
        up_val = (val1 + val2 + up_val) // 10           
        if l1_next or l2_next or up_val:
            r.next = ListNode(0)
            r.next.val = self.cal_next(up_val, l1_next, l2_next, r.next)     
        return r.val

