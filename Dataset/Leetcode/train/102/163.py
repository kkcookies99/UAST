class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if root==None:
            return []
        queue=[root]
        res=[]
        while queue:
            d=[]
            for i in range(len(queue)):
                cur=queue.pop(0)
                d.append(cur.val)
                if cur.left:
                    queue.append(cur.left)
                if cur.right:
                    queue.append(cur.right)
            if d:
                res.append(d)

        return res

