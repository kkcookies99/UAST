class Solution:
    def XXX(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return head
        
        slow_probe = head
        fast_probe = slow_probe.next
        
        while(fast_probe):
            if slow_probe.val == fast_probe.val:
                fast_probe = fast_probe.next
                slow_probe.next = fast_probe
            else:
                slow_probe = slow_probe.next
                fast_probe = fast_probe.next
        return head

