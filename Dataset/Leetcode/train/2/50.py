def pylist_to_listnode(self, pylist, link_count):
    if len(pylist) > 1:
        ret = precompiled.listnode.ListNode(pylist.pop())
        ret.next = self.pylist_to_listnode(pylist, link_count)
        return ret
    else:
        return precompiled.listnode.ListNode(pylist.pop(), None)

def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
    out = []
    L1 = self.listnode_to_pylist(l1)
    L2 = self.listnode_to_pylist(l2)
    
    if len(L2)>len(L1):
        m1 = L2
        m2 = L1
    else:
        m1 = L1
        m2 = L2

    up = 0
    for i in range(len(m2)):
        if m1[i]+m2[i]+up<=9:
            out.append(m1[i]+m2[i]+up)
            up = 0
        else:
            out.append(m1[i]+m2[i]+up-10)
            up = 1

    if up==1:
        if len(m1)==len(m2):
            out.append(1)
        else:
            if sum(m1[len(m2):])==(len(m1)-len(m2))*9:
                m1[len(m2):] = [0]*(len(m1)-len(m2))
                m1.append(1)
            else:
                for i in range(len(m2),len(m1)):
                    if m1[i]+1<=9:
                       m1[i]+=1
                       break
                    else:
                        m1[i] = 0
            for i in range(len(m2),len(m1)):
                out.append(m1[i])
    else:
        for i in range(len(m2),len(m1)):
            out.append(m1[i])
    return self.pylist_to_listnode(out[::-1], len(out))
