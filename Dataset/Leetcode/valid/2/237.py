class Solution(object):
    def XXX(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if not l1 :
            return l2
        if l2:
            l1.val=l1.val+l2.val
        if l1.val>=10:
            l1.val=l1.val%10
            if l1.next!=None:
                l1.next.val+=1
            else:
                l1.next=ListNode(1)
        if l2:
            l1.next=self.XXX(l1.next,l2.next)
        else:
            l1.next=self.XXX(l1.next,l2)
        return l1

