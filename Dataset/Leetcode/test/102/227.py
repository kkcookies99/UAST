class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:return []
        queue = [root]
        res = []
        while queue:
            temp = []
            for i in range(len(queue)):
                node = queue.pop(0)
                temp.append(node.val)
                if node.left:queue.append(node.left)
                if node.right:queue.append(node.right)
            res.append(temp)
            
        return res

