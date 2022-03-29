 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        if head.next == None:
            head = None
            return head
        h1 = head
        h2 = head
        i = 0
        while h1.next != None:
            if i < n:
                i += 1
            else:
                h2 = h2.next
            h1 = h1.next
        if i<n:
            head = h2.next
        else:
            h2.next = h2.next.next
        return head

