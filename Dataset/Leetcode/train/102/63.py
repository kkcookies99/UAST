class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        queue = []
        queue.insert(0,root)
        res = []
        if not root:
            return []
        while queue:
            n = len(queue)
            layer = []
            for i in range(n):
                temp = queue.pop()
                print(temp.val)
                if temp.left:
                    queue.insert(0,temp.left)
                if temp.right:
                    queue.insert(0,temp.right)
                layer.append(temp.val)
            res.append(layer)
        return res

