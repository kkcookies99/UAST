class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []

        res = []
        queue = [root]
        while queue:
            tmp = []
            for _ in range(len(queue)):
                tmp_node = queue.pop(0)
                tmp.append(tmp_node.val)
                if tmp_node.left:
                    queue.append(tmp_node.left)
                if tmp_node.right:
                    queue.append(tmp_node.right)

            res.append(tmp)

        return res

