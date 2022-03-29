class Solution(object):
    maxdepth = 0
    def dfs_depth(self,node,depth):
        if node != None:
            self.dfs_depth(node.left,depth+1)
            if depth > self.maxdepth:
                self.maxdepth = depth
            self.dfs_depth(node.right,depth+1)

    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        核心思想：
            dfs遍历最大深度，效果最差
        """
        self.dfs_depth(root,1)
        return self.maxdepth

