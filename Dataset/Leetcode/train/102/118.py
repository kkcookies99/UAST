class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        stack = [root]
        level = []
        cur_level = []
        res = []
        while stack:
            for cur_node in stack:
                cur_level.append(cur_node.val)
                if cur_node.left:
                    level.append(cur_node.left)
                if cur_node.right:
                    level.append(cur_node.right)
            stack = level[:]
            res.append(cur_level)
            level, cur_level = [], []
        return res

