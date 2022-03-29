class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root:
            return 0
        max_depth=0
        ret=[]
        def dfs(root,max_depth):
            if root:
                max_depth+=1
                if not root.left and not root.right:
                    ret.append(max_depth)
                    return
                else:
                    dfs(root.left,max_depth)
                    dfs(root.right,max_depth)
        dfs(root,max_depth)
        return min(ret)

