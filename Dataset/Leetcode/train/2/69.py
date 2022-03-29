# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        carry = 0 #进位表示 
        h1 = l1
        h2 = l2
        tail1 = None 
        tail2 = None
        while l1 and l2 : 
            if l1.next == None:
                tail1 = l1 
            if l2.next == None:
                tial2 = l2 
            t1 = l1.val 
            t2 = l2.val 
            l1.val = l2.val = (t1 + t2 + carry) % 10
            carry = (t1 + t2 + carry) // 10 
            l1 = l1.next 
            l2 = l2.next 
        if not l1 and not l2:
            if carry != 0:
                tail1.next = ListNode(carry)
            return h1 
        if l1:
            while l1:
                t= l1.val 
                l1.val = (t + carry) % 10
                carry  = (t + carry) //10
                if l1.next == None:
                    if carry !=0:
                        l1.next = ListNode(carry)
                        break
                l1 = l1.next 
            return h1
        if l2:
            while l2:
                t= l2.val 
                l2.val = (t + carry) % 10
                carry  = (t + carry) //10
                if l2.next == None:
                    if carry != 0:
                        l2.next = ListNode(carry)
                        break
                l2 = l2.next
            return h2
        return h1 

