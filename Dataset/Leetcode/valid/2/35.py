class Solution:
    def XXX(self, l1: ListNode, l2: ListNode , div = 0) -> ListNode:
        if l1 or l2 or div:
            div, mod = divmod((l1.val if l1 else 0) + (l2.val if l2 else 0) + div,10)
            return ListNode(mod, self.XXX(l1.next if l1 else None, l2.next if l2 else None, div))

