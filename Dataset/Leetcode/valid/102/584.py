class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        cur_layer, res = [root], []
        while cur_layer:
            res.append([node.val for node in cur_layer])
            next_layer = []
            for node in cur_layer:
                if node.left:
                    next_layer.append(node.left)
                if node.right:
                    next_layer.append(node.right)
            cur_layer = next_layer
        return res

