 class Solution(object):
    def XXX(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return 
        p = head
        while p:
            if p.next:
                if p.val == p.next.val:
                    if p.next.next:
                        p.next = p.next.next
                    else:
                        p.next = None
                else:
                    p = p.next
            else:
                p = p.next
        return head

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


