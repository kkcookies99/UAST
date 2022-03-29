 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        stack,node=[],head
        while(node):
            if node:
                stack.append(node)
                node=node.next
        if stack[-n]==head:return head.next
        prenode=stack[-n-1]
        prenode.next=prenode.next.next
        return head

