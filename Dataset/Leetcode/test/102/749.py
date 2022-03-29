 class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        i = 0
        res, chi = [ ], [ ]
        if root:
            queue = [(root, i)]
            while queue:
                node = queue.pop(0)
                if node[1] == i:
                    chi.append(node[0].val)
                else:
                    res.append(chi)
                    i += 1
                    chi = [ ]
                    chi.append(node[0].val)
                if node[0].left is not None:
                    queue.append((node[0].left, node[1]+1))
                if node[0].right is not None:
                    queue.append((node[0].right, node[1]+1))
            res.append(chi)
        return res

