 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        
        cur_node = head

        while cur_node is not None:
            tmp_node = None  # 断开链表，便于垃圾回收
            next_node = cur_node.next
            while next_node is not None and next_node.val == cur_node.val:
                tmp_node = next_node
                next_node = next_node.next
                        
            if tmp_node is not None:
                tmp_node.next = None
         
            cur_node.next = next_node
            cur_node = next_node

        return head

