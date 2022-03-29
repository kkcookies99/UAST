class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        queue=[]
        res=[]
        cur=[]
        
        queue.append(root)
        while queue:
            curCount=len(queue)
            for i in range(0,curCount):
                root=queue.pop(0)
                cur.append(root.val)
                if root.left:
                    queue.append(root.left)
                if root.right:
                    queue.append(root.right)
            res.append(cur)
            cur=[]   
        return res     


