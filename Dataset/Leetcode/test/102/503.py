class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        levels=[]
        def bfs(node,level):
            if not node:
                return 
            if len(levels)==level:
                 levels.append([])
            levels[level].append(node.val)
            bfs(node.left,level+1)
            bfs(node.right,level+1)
        
        bfs(root,0)
        return levels

