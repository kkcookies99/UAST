 class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        
        queue = [root]
        step = 1
        
        while queue:
            for _ in range(len(queue)):
                node = queue.pop(0)
                if node.right: queue.append(node.right)
                if node.left: queue.append(node.left)
                if not node.right and not node.left:
                    return step
            step += 1
                
        return step

