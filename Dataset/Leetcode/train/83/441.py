 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        pre=ListNode(-1)
        cur=head
        hashmap=[]
        while cur!=None:
            if cur.val in hashmap:
                pre.next=cur.next
                cur=cur.next
            else:
                hashmap.append(cur.val)
                pre=cur
                cur=cur.next
        return head

