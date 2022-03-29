class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        # 快慢指针
        if head is None or head.next is None:
            return head
        pr1 = head
        pr2 = head.next
        while pr2:
            if pr1.val == pr2.val:
                pr2 = pr2.next
                pr1.next = pr2
            else:
                pr2 = pr2.next
                pr1 = pr1.next
        return head

