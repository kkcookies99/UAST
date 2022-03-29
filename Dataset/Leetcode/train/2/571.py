 class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        ptr1 = l1
        ptr2 = l2
        l3 = ListNode(0)
        ptr3 = l3
        carry_bit = 0
        while ptr1 or ptr2:
            if not ptr1:
                new_val = ptr2.val + carry_bit
                ptr2 = ptr2.next
            elif not ptr2:
                new_val = ptr1.val + carry_bit
                ptr1 = ptr1.next
            else:
                new_val = ptr1.val + ptr2.val + carry_bit
                ptr1 = ptr1.next
                ptr2 = ptr2.next
            carry_bit = new_val // 10
            new_val %= 10
            new_node = ListNode(new_val)
            ptr3.next = new_node
            ptr3 = ptr3.next
        if carry_bit != 0:
            ptr3.next = ListNode(carry_bit)
        return l3.next

