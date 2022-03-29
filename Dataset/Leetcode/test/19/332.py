 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        ptr = head
        cnt = 0
        while ptr:
            ptr = ptr.next
            cnt += 1
        # print(cnt)
        fast = head
        if cnt - n - 1 < 0: 
            return head.next
        for _ in range(cnt - n - 1):
            fast = fast.next
        fast.next = fast.next.next
        return head


