class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:

        queue = [root] if root!=None else []
        res = []
        while queue:

            queue2 = []
            ans = []
            while queue:
                node = queue.pop(0)
                ans.append(node.val)
                if node.left:
                    queue2.append(node.left)
                if node.right:
                    queue2.append(node.right)
            queue = queue2[:]
            res.append(ans)
        return res

