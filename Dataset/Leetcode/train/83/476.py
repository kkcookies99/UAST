 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if not head or not head.next: # 链表为空或者只有1个node,直接返回
            return head
        # 此时，我们认为链表就2个node:头和已经去过重的后续
        if head.val == head.next.val:  
            return self.XXX(head.next)
        else:
            head.next = self.XXX(head.next)
            return head
