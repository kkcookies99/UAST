 class Solution(object):
    def XXX(self, head, n):
        fast = slow = head
        res = ListNode(val = slow.val)
        cur = res
        for _ in range(n):
            fast = fast.next
        if not fast:
            return slow.next
        while fast and fast.next: 
            fast = fast.next
            slow = slow.next
            cur.next = slow
            cur = cur.next
        slow.next = slow.next.next
        cur.next = slow.next
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

