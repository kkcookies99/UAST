 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def isValidSubTree(root, min_splitter, max_splitter):
            if root == None:
                return True
            if root.val <= min_splitter or root.val >= max_splitter:
                return False
            return isValidSubTree(root.left, min_splitter, min(max_splitter, root.val)) and isValidSubTree(root.right, max(min_splitter, root.val), max_splitter)
        return isValidSubTree(root, -float(inf), float(inf))

