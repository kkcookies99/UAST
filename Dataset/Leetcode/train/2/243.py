# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        l3 = ListNode()
        m = l3
        carry = 0 
        while l1 or l2:

            # 如果存在就获取链表节点的值
            a = l1.val if l1 else 0
            b = l2.val if l2 else 0

            c = a + b + carry
            carry = c // 10
            last = ListNode()
            last.val = c % 10
            m.next = last

            # 查找到结果数据的尾部节点
            m = m.next

            # 确保能够遍历到结果
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
        # 处理最后一位需要进位的特殊情况
        if carry > 0:
            last = ListNode()
            last.val = carry
            m.next = last
        # l3的首节点值是0,需要要返回下一个开始，然后return会循环返回下一个直到为空
        return l3.next



