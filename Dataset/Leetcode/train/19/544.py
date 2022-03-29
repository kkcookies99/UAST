 class Solution:
    def XXX(self, head, n):
        preHead = ListNode(0)
        preHead.next = head
        p = preHead
        q = head
        for i in range(n):
            q = q.next

        while q != None:
            p = p.next
            q = q.next

        p.next = p.next.next
        return preHead.next

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


