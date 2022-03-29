class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if root == None:
            return([])
        
        res = [[]]
        layer = deque()
        layer.append(root)
        i = 0
        while len(layer) != 0:
            count = len(layer)
            while count > 0:
                if layer[0].left != None:
                    layer.append(layer[0].left)
                if layer[0].right != None:
                    layer.append(layer[0].right)
                res[i].append(layer.popleft().val)
                count -= 1
            i += 1
            res.append([])
        return res[:-1]

