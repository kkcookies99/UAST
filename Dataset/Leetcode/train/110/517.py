class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True

        def getHeight(node,h):
            if not node:
                return h-1
            if node.left or node.right:
                h = max(getHeight(node.left,h+1),getHeight(node.right,h+1))
            return h

        queue = [root]
        while queue:
            node = queue.pop()
            h1 = getHeight(node.left,0)
            h2 = getHeight(node.right,0)
            if abs(h1-h2)>1:
                return False
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
            

        return True

