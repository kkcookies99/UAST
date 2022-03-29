 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return True
        stack=[root]
        while stack:
            temp=[]
            for i in range(len(stack)):
                node=stack.pop(0)
                if node:
                    temp.append(node.val)
                    if node.left:
                        stack.append(node.left)
                    else:
                        stack.append(None)
                    if  node.right:
                        stack.append(node.right)
                    else:
                        stack.append(None)
                else:
                    temp.append('#')
               
            if temp!=temp[::-1]:
                return False
        return True
                        

