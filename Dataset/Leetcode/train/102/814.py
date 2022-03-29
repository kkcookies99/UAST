 class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return None
        res = []
        nodes = [root]
        while nodes:
            curStack = []
            nextStack = []
            for node in nodes:
                curStack.append(node.val)
                if node.left:
                    nextStack.append(node.left)
                if node.right:
                    nextStack.append(node.right)
            res.append(curStack)
            nodes = nextStack
        return res