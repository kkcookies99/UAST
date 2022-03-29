 class Solution(object):
    def XXX(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        if not head.next:
            return None
        else:
            length = 1
            curr, prev = head, None
            while curr.next:
                length, prev, curr = length + 1, curr, curr.next 

            if n == 1:
                prev.next = None
                return head
            elif n == length:
                return head.next
            else:
                i = 0
                curr, prev = head, None
                while i < (length - n):
                    i, prev, curr = i + 1, curr, curr.next 
                prev.next = curr.next
                return head

