 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        front = head.next if head else None
        cur = head
        while front:
            if front.val != cur.val:
                cur = front
                front = front.next
            else:
                cur.next = front.next
                front = front.next
        return head

