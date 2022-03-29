 class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root: return 0
        Q, d = [root], 1
        while Q:
            nQ = []
            for node in Q:
                if not node.left and not node.right:
                    return d
                node.left and nQ.append(node.left)
                node.right and nQ.append(node.right)
            d += 1        
            Q = nQ    
        return 0 

