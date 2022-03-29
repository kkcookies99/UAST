 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        '''
        如果自顶向下，比较left和right节点高度和递归调用left子树，right子树平衡判断两部分将有重复遍历；
        因此考虑在比较left和right节点高度的同时，进行left子树和right子树平衡判断，而left，right高度由各自left，right子节点高度决定；
        那么每次判断left，right子节点高度后再决定是否计算父节点高度，如果已经不平衡，父节点高度就没有计算的必要了
        '''
        if not root:
            return True
        
        def get_height(node):
            if not node:
                return 0
            
            left = get_height(node.left)
            right = get_height(node.right)

            if abs(left - right) > 1 or left == -1 or right == -1:
                return -1
            
            return max(left, right) + 1

        return get_height(root) != -1

