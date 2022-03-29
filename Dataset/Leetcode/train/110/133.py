class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def helper(root):
            if not root:
                return True,0
            judge_r,depth_r=helper(root.right)
            judge_l,depth_l=helper(root.left)

            depth=max(depth_l,depth_r)+1
            depth_diff=abs(depth_l-depth_r)
            if judge_r and judge_l and depth_diff<=1:
                return True,depth
            return False,depth
        judge,depth=helper(root)
        return judge

