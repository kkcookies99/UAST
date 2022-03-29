 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        ptr=head
        while(ptr):
            if(ptr.next==None):
                break
            if(ptr.val==ptr.next.val):
                ptr.next=ptr.next.next
            else:
                ptr=ptr.next
        return head

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


