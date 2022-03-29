 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        try:
            new_head = new_tail = ListNode(head.val)
            p = head.next
            while p:
                if new_tail.val != p.val:
                    node = ListNode(p.val)
                    new_tail.next = node
                    new_tail = node
                p = p.next
            return new_head
        except:
            return head

