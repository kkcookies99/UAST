class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        
        res = []
        que = [root]
        while que:
            vals = []
            for i in range(len(que)):
                node = que.pop(0)
                vals.append(node.val)
                if node.left:
                    que.append(node.left)
                if node.right:
                    que.append(node.right)
            res.append(vals)
        
        return res

