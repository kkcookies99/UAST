class Solution:
    def XXX(self, root: TreeNode) -> int:

        def cal_depth(root, depth):
            if not root: # 都为Null
                return depth
            depth += 1
            return max(cal_depth(root.left, depth), cal_depth(root.right, depth))

        return cal_depth(root,0)

