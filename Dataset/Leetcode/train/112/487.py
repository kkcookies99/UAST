 class Solution(object):
    def XXX(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        res=[] #存所有路径和
        if root==None:
            return False
        stack=[root]
        while(len(stack)!=0):
            temp=stack.pop(0)
            if temp.left==None and temp.right==None:
                res.append(temp.val)   #将根节点到各个节点的距离保存在节点上
            if temp.left:
                temp.left.val+=temp.val
                stack.append(temp.left)
            if temp.right:
                temp.right.val+=temp.val
                stack.append(temp.right)
        if sum in res:
            return True
        else:
            return False

