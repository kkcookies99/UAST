 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def symmetric(node1, node2):              #定义判断两个子树是否对称函数
            if node1 is None and node2 is None:   #如果两个子树的根节点都是空的,则对称返回True
                return True
            elif node1 is None or node2 is None:  #如果两个子树的根节点一个为空一个不为空,则不对称返回False
                return False
            else:                           #如果两个子树的根节点都不为空
                if node1.val != node2.val:  #如果两个子树的根节点的值不相等,则不对称返回False
                    return False
                else:                       #如果两个子树的根节点的值相等,则递归判断它们的对称子孩子是否相等
                    return symmetric(node1.left, node2.right) and symmetric(node1.right, node2.left) 
        return symmetric(root, root)        #调用子树是否对称函数

