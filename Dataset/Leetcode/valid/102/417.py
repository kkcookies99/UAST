class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []

        cur_level, next_level, res, num = [root], [], [], []

        while cur_level:
            node = cur_level.pop(0)
            num.append(node.val)
            if node.left:
                next_level.append(node.left)
                
            if node.right:
                next_level.append(node.right)

            if not cur_level:
                cur_level, next_level = next_level, []
                res.append(num)
                num = []
        return res

