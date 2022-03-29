class Solution:
    def XXX(self, root: TreeNode) -> int:

        def f(rootList, depth):
            if rootList == [None]:
                return 0
            buf = []
            for node in rootList:
                if node.left:
                    buf.append(node.left)
                if node.right:
                    buf.append(node.right)
                if not node.left and not node.right:
                    return depth
            return f(buf, depth + 1)
        
        return f([root], 1)

