 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        if p and q and p.val!=q.val:
            return False 

        quenep, queneq= [p], [q]
        while quenep and queneq:
            tmpp = list()
            tmpq = list()
            for node in quenep:
                if node != None:
                    if node.left:
                        tmpp.append(node.left)
                    else:
                        tmpp.append(None)
                    if node.right:
                        tmpp.append(node.right)
                    else:
                        tmpp.append(None)
            for node in queneq:
                if node != None:
                    if node.left:
                        tmpq.append(node.left)
                    else:
                        tmpq.append(None)
                    if node.right:
                        tmpq.append(node.right)
                    else:
                        tmpq.append(None)
            pval = [node.val if node!=None else None for node in tmpp]
            qval = [node.val if node!=None else None for node in tmpq]
            if pval == qval:
                quenep = tmpp
                queneq = tmpq
            else:
                return False
        return True