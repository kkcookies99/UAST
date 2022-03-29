 class Solution:
    def XXX(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        lst = []
        jinwei = 0
        nul = ListNode(0)
        while l1 or l2:
            l1 = nul if l1 is None else l1
            l2 = nul if l2 is None else l2
            result = l1.val + l2.val + jinwei
            if result >= 10:
                result = result - 10
                jinwei = 1
            else:
                jinwei = 0
            lst.append(result)
            l1, l2 = l1.next, l2.next
        if jinwei == 1:
            lst.append(1)
        return lst

