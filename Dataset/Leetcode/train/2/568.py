 class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        res1=[]
        res2=[]
        while l1:
            res1.append(l1.val)
            l1=l1.next 
        while l2:
            res2.append(l2.val)
            l2=l2.next 
        res1=int("".join(map(str,res1[::-1])))
        res2=int("".join(map(str,res2[::-1])))
        res=list(str(res1+res2))
        res=res[::-1]
        head=ListNode(int(res[0]))
        cur=head
        for i in range(1,len(res)):
            node=ListNode(int(res[i]))
            cur.next=node 
            cur=node 
        return head 

