 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        if not head: return head
        nodes, cur = [], head
        while cur:
            nodes.append(cur)
            cur = cur.next
        if n == len(nodes):
            return head.next
        elif n == 1:
            nodes[-2].next = None
        elif n == 0:
            pass
        else:
            nodes[0 - n - 1].next = nodes[0 - n + 1]
        return head

