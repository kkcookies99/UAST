class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        last_node = None
        cur_node = head

        while cur_node:
            
            if cur_node.next and cur_node.val == cur_node.next.val:
                cur_node.next = cur_node.next.next
            else:
                cur_node = cur_node.next

        return head

