class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        ans = 0
        curLevel = [root]
        while len(curLevel) != 0:
            ans += 1
            nextLevel = []
            for node in curLevel:
                if not node.left and not node.right: # 叶子节点
                    return ans
                if node.left:
                    nextLevel.append(node.left)
                if node.right:
                    nextLevel.append(node.right)
            curLevel = nextLevel
        return ans

