 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        # 规律: BST的中序遍历节点数值是从小到大. 
        cur_max = -float("INF")
        def __XXX(root: TreeNode) -> bool: 
            nonlocal cur_max
            
            if not root: 
                return True
            
            is_left_valid = __XXX(root.left)
            if cur_max < root.val: 
                cur_max = root.val
            else: 
                return False
            is_right_valid = __XXX(root.right)
            
            return is_left_valid and is_right_valid
        return __XXX(root)

