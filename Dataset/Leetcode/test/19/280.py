 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        first = second = third = head
        count = 0
        while first != None:
            first = first.next
            if count > n:
                second = second.next
            if count >= n:
                third = third.next
            count += 1
        if second == head :
            if second == third:
                return head.next
        second.next = third.next
        return head

