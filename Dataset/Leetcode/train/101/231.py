 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return True
        else:
            return self.dfs(root.left, root.right)
    
    def dfs(self, left_tree, right_tree):
        if not left_tree and not right_tree:
            return True
        elif left_tree and right_tree:
            if left_tree.val != right_tree.val:
                return False
            else:
                return self.dfs(left_tree.left, right_tree.right) and self.dfs(left_tree.right, right_tree.left)
        else:
            return False

