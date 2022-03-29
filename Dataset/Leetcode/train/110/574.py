class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def height_balanced(root):
            if root:
                left = height_balanced(root.left)
                right = height_balanced(root.right)
                return (max(left[0], right[0]) + 1, left[1] and right[1] and abs(left[0] - right[0]) <= 1)
            return (0, True);
        res = height_balanced(root)
        return res[1]

