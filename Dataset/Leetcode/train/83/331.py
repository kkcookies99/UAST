class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        # 快慢指针
        if head == None:
            return head
        slow, fast = head, head.next
        while fast != None:
            if slow.val == fast.val:
                fast = fast.next
                slow.next = fast
            else:
                slow = slow.next
                fast = fast.next
        return head

