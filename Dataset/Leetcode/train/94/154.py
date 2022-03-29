 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        #非递归方法
        stack=[]
        ans=[]
        while(root or stack):
            while(root):
                stack.append(root)
                root=root.left
            root=stack.pop()
            ans.append(root.val)
            root=root.right
        return ans

