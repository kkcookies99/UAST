class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if head is None : return head
        if head.next is None: return head
        slow = head
        curr = head
        while slow.next is not None:
            print('```````')
            print('slow:',slow)
            print(curr)
            while curr.next:
                # print(curr)
                # print(curr.next)
                curr_next = curr.next
                if slow.val == curr_next.val:
                    curr.next = curr_next.next
                else:
                    curr = curr.next
            slow = slow.next
            curr = slow
        return head

