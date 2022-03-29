class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        res = []
        if not root:
            return res
        else:
            queue = [root]
            while queue:
                tmp = []
                for _ in range(len(queue)):
                    node = queue.pop(0)
                    tmp.append(node.val)
                
                    if node.left:
                        queue.append(node.left)
                    if node.right:
                        queue.append(node.right)
                res.append(tmp)

            return res

