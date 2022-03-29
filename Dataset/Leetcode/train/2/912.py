 class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        re = ListNode(0)
        cur = re
        carry = 0
        while l1 and l2:
            x = l1.val if l1 else 0
            y = l2.val if l2 else 0
            s = x + y + carry
            carry = s // 10
            cur.next = ListNode(s % 10)
            cur = cur.next
            l1 = l1.next
            l2 = l2.next
        if l1 or l2:
            if l1:
                cur.next = l1
            else:
                cur.next = l2
            while carry>0:
                if cur.next:
                    s = cur.next.val+carry
                    carry = s//10
                    cur.next.val = s%10
                    cur = cur.next
                else:
                    cur.next = ListNode(1)
                    carry=0
        else:
            if (carry > 0):
                cur.next = ListNode(1)
        return re.next 

