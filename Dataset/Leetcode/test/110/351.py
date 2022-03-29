class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def deep_count(root):
            if not root:
                return 0
            left_deep = deep_count(root.left)
            if left_deep == -1:
                return -1
            right_deep = deep_count(root.right)
            if right_deep == -1 or abs(right_deep - left_deep)>1:
                return -1
            return max(right_deep,left_deep) + 1
        return deep_count(root)>-1

