 class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        q = [root]
        res = []
        while q:
            temp = []
            new_q = []
            while q:
                node = q.pop(0)
                temp.append(node.val)
                if node.left:
                    new_q.append(node.left)
                if node.right:
                    new_q.append(node.right)
            q = new_q
            res.append(temp)
        return res

