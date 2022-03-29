 class Solution(object):
    def XXX(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        count=0
        ret=[]
        def dfs(root,count):
            if root:
                count+=root.val
                if not root.left and not root.right:
                    if count==sum:
                        ret.append(True)
                        return
                else:
                    dfs(root.left,count)
                    dfs(root.right,count)
        dfs(root,count)
        ret.append(False)
        return ret[0]

