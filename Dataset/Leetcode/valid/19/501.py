 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        #快慢指针
        pre = ListNode(0)
        low,fast,pre.next = head,head,head
        step = 0
        while fast:
            if step < n:
                fast = fast.next
                step += 1
            else:
                fast = fast.next
                pre = low 
                low = low.next
        if pre.next == head:return head.next
        else:pre.next = low.next 
        return head

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


