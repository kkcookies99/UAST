 class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        out = l1
        carry = 0
        lv = l2.val
        while True:
            val = l1.val + lv
            
            l1.val = val % 10
            lv = val > 9  # carry
            
            if l1.next:
                if l2.next:
                    l2 = l2.next
                    lv += l2.val 
            else:
                if l2.next:
                    l1.next = l2.next 
                    l2.next = None
                else:
                    l1.next = ListNode(1) if lv else None
                    break

            l1 = l1.next
                
        return out

