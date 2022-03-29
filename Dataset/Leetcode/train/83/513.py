 class Solution(object):
    def XXX(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return None
        dummy = pre = ListNode('1')
        p = head
        while p.next != None:
            if p.next != None and p.val != p.next.val:
                pre.next = p
                pre = p
                p = p.next
            while p.next != None and p.val == p.next.val:
                p = p.next
        pre.next = p
        return dummy.next

