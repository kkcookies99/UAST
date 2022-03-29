 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        if not root:return []
        queue=[root]
        value=[]
        while queue:
            r=queue.pop()
            if not r.left and not r.right: 
                value.append(r.val)
                continue
            if r.right: queue.append(r.right)
            queue.append(r)
            if r.left:queue.append(r.left)
            r.right,r.left=None,None
        return value



