 class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        ln1=[]
        ln2=[]
        while l1 or l2:
            ln1.append(l1.val) if l1 else 0
            ln2.append(l2.val) if l2 else 0
            if l1: l1 = l1.next
            if l2: l2 = l2.next
            
        strl1 = []
        strl2 = []
        for v in ln1:
            strl1.insert(0, str(v))
        for v in ln2:
            strl2.insert(0, str(v))
        a = "".join(strl1)
        b = "".join(strl2)
        c = str(int(a)+int(b))
        res = []
        for v in c:
            res.insert(0, int(v))
        return res

