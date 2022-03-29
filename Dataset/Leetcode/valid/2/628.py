 class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        stack = []
        while l1:
            stack.append(str(l1.val))
            l1 = l1.next
        num1 = ''
        while stack:
            num1 += stack.pop()
        num1 = int(num1)
        while l2:
            stack.append(str(l2.val))
            l2 = l2.next
        num2 = ''
        while stack:
            num2 += stack.pop()
        num2 = int(num2)
        result = str(num1+num2)
        end = len(result)-1
        head = ListNode(int(result[end]))
        start = head
        end -= 1
        while end!=-1:
            new = ListNode(int(result[end]))
            head.next = new
            head = new 
            end-=1
        return start

