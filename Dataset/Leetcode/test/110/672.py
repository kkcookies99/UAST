 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def depth(root):
            if(not root):return 0
            left=depth(root.left)
            if(left==-1):return -1
            right=depth(root.right)
            if(right==-1):return -1
            return max(left,right)+1 if abs(left-right)<2 else -1
        return depth(root)!=-1

