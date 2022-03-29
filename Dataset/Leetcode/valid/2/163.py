# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:

    def XXX(self, l1: ListNode, l2: ListNode, other=0) -> ListNode:
        
        a, a_next = (l1.val, l1.next) if l1 else (None, None)
        b, b_next = (l2.val, l2.next) if l2 else (None, None)
        if a is None and b is None and other == 0:
            return 
        if a is None:
            a = 0
        if b is None:
            b = 0
        _sum = a + b + other
        
        this = _sum % 10
        that = _sum // 10
        this_node = ListNode(this)
        this_node.next = self.XXX(a_next, b_next, that)
        
        return this_node