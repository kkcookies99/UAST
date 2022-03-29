 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        #定义一个函数判断两个节点是否镜像
        def isNodeSymmetric(node1: TreeNode, node2: TreeNode) -> bool:
            #如果一个节点有值而另一边节点无值
            if (node1 and not node2) or (node2 and not node1): return False
            #如果两个节点都无值
            if not node1 and not node2: return True
            #如果两个节点的值不相等
            if node1 and node2 and node1.val != node2.val: return False
            #判断节点1的左边和节点2的右边是否相同，节点1的右边和节点2的左边是否相同
            if isNodeSymmetric(node1.left, node2.right) and isNodeSymmetric(node1.right, node2.left): return True
            return False
        
        return isNodeSymmetric(root, root)

