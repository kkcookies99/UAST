class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        res=[]
        order(root,res,0)
        return res

# 当res的长度小于或等于当前层数时，res加入一个层数list，然后依次按照层数加入
def order(root,res,level):
    if root is not None:
        if level>=len(res):
            res.append([])
        res[level].append(root.val)
        order(root.left,res,level+1)
        order(root.right,res,level+1)

