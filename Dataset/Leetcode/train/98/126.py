 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        temp=[]
        def fun(node):
            node.left and fun(node.left)
            temp.append(node.val)
            node.right and fun(node.right)
        root and fun(root)
        return all(map(int.__lt__,temp,temp[1:]))

