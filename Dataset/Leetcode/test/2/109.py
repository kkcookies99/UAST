# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        list1, list2 = [], []
        while l1:
            list1.append(l1.val)
            l1 = l1.next
        while l2:
            list2.append(l2.val)
            l2 = l2.next
        sum1, sum2 = 0, 0
        j1, j2 = -1, -1
        for i in range(len(list1)):
            sum1 = sum1 * 10 + list1[j1]
            j1 -= 1
        for i in range(len(list2)):
            sum2 = sum2 * 10 + list2[j2]
            j2 -= 1
        res = sum1 + sum2
        li = list(map(int, list(str(res))))
        head = ListNode(li[-1])
        p = head
        for i in range(len(li) - 2, -1, -1):
            p.next = ListNode(li[i])
            p = p.next
        return head


