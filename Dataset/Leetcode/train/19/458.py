 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        node_list = []
        dummy_head = ListNode(next=head)
        cur = dummy_head
        while cur:
            node_list.append(cur)
            cur = cur.next
        left = node_list[-n-1]
        left.next = left.next.next
        return dummy_head.next
        
  

