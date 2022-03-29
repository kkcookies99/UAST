 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        if root == None:
            return []
        stack = []
        ret = []
        
        while(True):
            while(root):
                stack.append(root)
                root = root.left
            
            if len(stack) == 0:
                break
                
            node = stack.pop()
            ret.append(node.val)
            root = node.right
        
        return ret

