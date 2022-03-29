class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        queque=[root,]
        res=[]
        while queque:
            sub=[]
            lens=len(queque)
            for x in queque:
                sub.append(x.val)
            res.append(sub)
            for i in range(lens):
                p=queque.pop(0)
                if p.left:
                    queque.append(p.left)
                if p.right:
                    queque.append(p.right)
        return res

