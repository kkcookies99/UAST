 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if not head:
            return None
        
        pre = ListNode(None)
        pre.next = head

        tmp = pre.next
        while tmp.next:
            if tmp.val == tmp.next.val:
                tmp.next = tmp.next.next
            else:
                tmp = tmp.next

        return pre.next

