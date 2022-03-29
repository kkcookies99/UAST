 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if not head or head.next is None:
            return head
        current = head.next
        next = current.next
        back = head

        while True:
            if current is None:
                break
            data_cmp = back.val
            if current.val == data_cmp:
                current = next
                back.next = current
                if current is None:
                    break
                next = current.next
            else:
                back = current
                current = current.next
                if current is None:
                    break
                next = current.next
        return head

