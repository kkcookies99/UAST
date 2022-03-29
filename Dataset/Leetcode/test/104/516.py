class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        
        queue = [root]

        if root is None:
            return
        
        left_num = 0
        right_num = 0

        while queue:
            cur_node = queue.pop(0)
            
            if cur_node.left is not None:
                queue.append(cur_node.left)
                left_num += 1
            if cur_node.right is not None:
                queue.append(cur_node.right)
                right_num += 1

        return max(left_num,right_num) +1

