# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy = p = ListNode(None)
        s = 0

        while l1 or l2 or s != 0:
            s += (l1.val if l1 else 0) + (l2.val if l2 else 0)
            p.next = ListNode(s % 10)
            p = p.next
            if l1: l1 = l1.next
            if l2: l2 = l2.next
            s = s // 10

        return dummy.next

