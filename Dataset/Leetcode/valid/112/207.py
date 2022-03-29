 class Solution:
    def XXX(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if root == None:
            return False
        queue = [(root, root.val)]
        
        while queue != []:
            node, num = queue.pop()

            left_ = True
            right_ = True

            if node.left:
                queue.append((node.left, num + node.left.val))
                left_ = False

            if node.right:
                queue.append((node.right, num + node.right.val))
                right_ = False

            if left_ and right_:
                if num == targetSum:
                    return True
        return False

