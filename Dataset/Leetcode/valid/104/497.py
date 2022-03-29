class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        #if (not root.right) and (not root.left):
        #    return 1
        return max(self.XXX(root.left),self.XXX(root.right)) + 1

