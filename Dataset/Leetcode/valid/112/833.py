 class Solution(object):
    tree_sum_list = []
    def tree_pathSum(self,root,tree_sum):
        if root is None:
            return 0
        elif root.left is None and root.right is None:
            tree_sum += root.val
            self.tree_sum_list.append(tree_sum)
            tree_sum -= root.val
        else:
            tree_sum += root.val
            self.tree_pathSum(root.left,tree_sum)
            self.tree_pathSum(root.right,tree_sum)
            tree_sum -= root.val

    def XXX(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        tree_sum = 0
        
        self.tree_pathSum(root,tree_sum)
        # print(self.tree_sum_list)
        if sum in self.tree_sum_list:   
            return True
        return False

