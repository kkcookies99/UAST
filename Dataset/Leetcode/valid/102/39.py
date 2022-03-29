class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        res=list()
        if not root:
            return res
        queue=list()
        queue.append(root)

        while len(queue)!=0:
            sz=len(queue)
            temp=list()
            while sz>0:
                top=queue[0]
                del queue[0]
                temp.append(top.val)
                if top.left:queue.append(top.left)
                if top.right:queue.append(top.right)
                sz-=1
            res.append(temp)
        return res

