 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        self.res=True
        def judge(root):
            if(not root):return 0
            left=judge(root.left)+1
            right=judge(root.right)+1
            if(abs(left-right)>1):
                self.res=False
            return max(left,right)
        judge(root)
        return self.res

